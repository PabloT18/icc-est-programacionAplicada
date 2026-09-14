package edu.ups.pap.u05;
import edu.ups.pap.comun.Protocolo;
import java.sql.*;
import java.util.concurrent.*;
public class IntegracionDemo {
    public static void main(String[] args) throws Exception {
        BlockingQueue<Protocolo.Dato> cola = new ArrayBlockingQueue<>(10);
        for(String linea:new String[]{"DATA;1;100","DATA;2;500","DATA;3;900"}) {
            var mensaje=Protocolo.parsear(linea);
            if(mensaje instanceof Protocolo.Dato dato) cola.put(dato);
        }
        try(Connection c=DriverManager.getConnection("jdbc:h2:mem:integracion")) {
            try(Statement s=c.createStatement()) {
                s.execute("CREATE TABLE lectura(sesion VARCHAR(40),secuencia BIGINT,raw INT,PRIMARY KEY(sesion,secuencia))");
            }
            c.setAutoCommit(false);
            try(PreparedStatement p=c.prepareStatement("INSERT INTO lectura VALUES(?,?,?)")) {
                Protocolo.Dato d;
                while((d=cola.poll())!=null) {
                    p.setString(1,"sesion-demo");p.setLong(2,d.secuencia());p.setInt(3,d.raw());p.addBatch();
                }
                p.executeBatch();c.commit();
            } catch(SQLException e) {c.rollback();throw e;}
            try(Statement s=c.createStatement();ResultSet r=s.executeQuery("SELECT COUNT(*),AVG(raw) FROM lectura")) {
                r.next();System.out.println("Confirmadas: "+r.getInt(1));
                System.out.println("Promedio raw: "+r.getDouble(2));
            }
        }
    }
}
