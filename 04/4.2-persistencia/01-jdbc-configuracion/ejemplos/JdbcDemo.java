package edu.ups.pap.u04;
import edu.ups.pap.comun.Config;
import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        try (Connection c = Config.abrir()) {
            DatabaseMetaData meta = c.getMetaData();
            System.out.println("Motor: " + meta.getDatabaseProductName());
            try (PreparedStatement p = c.prepareStatement("SELECT 1 AS estado");
                 ResultSet r = p.executeQuery()) {
                if(r.next()) System.out.println("Conexión: " + r.getInt("estado"));
            }
        }
    }
}
