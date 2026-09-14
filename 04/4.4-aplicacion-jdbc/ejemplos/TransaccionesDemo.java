package edu.ups.pap.u04;
import java.sql.*;
public class TransaccionesDemo {
    public static void main(String[] args) throws SQLException {
        try(Connection c=DriverManager.getConnection("jdbc:h2:mem:transacciones")) {
            try(Statement s=c.createStatement()) {s.execute("CREATE TABLE lectura(id INT PRIMARY KEY, valor DOUBLE PRECISION NOT NULL)");}
            c.setAutoCommit(false);
            try(PreparedStatement p=c.prepareStatement("INSERT INTO lectura(id,valor) VALUES(?,?)")) {
                p.setInt(1,1);p.setDouble(2,22);p.executeUpdate();
                p.setInt(1,1);p.setDouble(2,24);p.executeUpdate();
                c.commit();
            } catch(SQLException e) {
                try {c.rollback();} catch(SQLException rollback) {e.addSuppressed(rollback);throw e;}
                System.out.println("Lote revertido por clave duplicada");
            } finally {c.setAutoCommit(true);}
            try(Statement s=c.createStatement();ResultSet r=s.executeQuery("SELECT COUNT(*) FROM lectura")) {
                r.next();System.out.println("Filas confirmadas: "+r.getInt(1));
                if(r.getInt(1)!=0) throw new AssertionError("Rollback incompleto");
            }
        }
    }
}
