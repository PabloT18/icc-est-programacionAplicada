package edu.ups.pap.u04;
import java.sql.*;
public class RelacionalDemo {
    public static void main(String[] args) throws SQLException {
        try (Connection c = DriverManager.getConnection("jdbc:h2:mem:modelo")) {
            try (Statement s = c.createStatement()) {
                s.execute("CREATE TABLE sensor(id VARCHAR(8) PRIMARY KEY, ubicacion VARCHAR(80) NOT NULL)");
                s.execute("CREATE TABLE lectura(id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY, sensor_id VARCHAR(8) REFERENCES sensor(id), valor DOUBLE PRECISION NOT NULL)");
                s.executeUpdate("INSERT INTO sensor VALUES('S01','Lab'),('S02','Biblioteca')");
                s.executeUpdate("INSERT INTO lectura(sensor_id,valor) VALUES('S01',22),('S01',24)");
                try (ResultSet r=s.executeQuery("SELECT s.id,COUNT(l.id) cantidad FROM sensor s LEFT JOIN lectura l ON s.id=l.sensor_id GROUP BY s.id ORDER BY s.id")) {
                    while(r.next()) System.out.println(r.getString("id")+": "+r.getInt("cantidad"));
                }
            }
        }
    }
}
