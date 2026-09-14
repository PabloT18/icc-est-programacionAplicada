package edu.ups.pap.u04;
import java.sql.*;
import javax.sql.rowset.*;
public class RowSetDemo {
    public static void main(String[] args) throws SQLException {
        try(CachedRowSet copia=RowSetProvider.newFactory().createCachedRowSet()) {
            try(Connection c=DriverManager.getConnection("jdbc:h2:mem:filas")) {
                try(Statement s=c.createStatement()) {
                    s.execute("CREATE TABLE lectura(id INT PRIMARY KEY,sensor VARCHAR(8),valor DOUBLE PRECISION)");
                    s.executeUpdate("INSERT INTO lectura VALUES(1,'S01',22),(2,'S01',24),(3,'S02',30)");
                }
                try(PreparedStatement p=c.prepareStatement("SELECT id,valor FROM lectura WHERE sensor=? ORDER BY id")) {
                    p.setString(1,"S01");
                    try(ResultSet r=p.executeQuery()){copia.populate(r);}
                }
            }
            while(copia.next()) System.out.println(copia.getInt("id")+": "+copia.getDouble("valor"));
            System.out.println("Filas desconectadas: "+copia.size());
        }
    }
}
