package edu.ups.pap.comun;
import java.io.*;
import java.sql.*;
import java.util.*;
import org.snakeyaml.engine.v2.api.*;
public final class Config {
    private Config() {}
    public static Connection abrir() throws SQLException {
        LoadSettings settings = LoadSettings.builder().setLabel("application.yaml")
            .setCodePointLimit(16_384).setMaxAliasesForCollections(10).build();
        Object valor;
        try (InputStream in=Config.class.getResourceAsStream("/application.yaml")) {
            if(in==null) throw new IllegalStateException("Falta application.yaml en el classpath");
            valor=new Load(settings).loadFromInputStream(in);
        } catch(IOException e) {throw new IllegalStateException("No se pudo leer configuración",e);}
        if(!(valor instanceof Map<?,?> raiz) || !(raiz.get("database") instanceof Map<?,?> db))
            throw new IllegalStateException("Se requiere el mapa database");
        String url=valor(db,"url","PAP_DB_URL",false);
        String user=valor(db,"user","PAP_DB_USER",false);
        String password=valor(db,"password","PAP_DB_PASSWORD",true);
        return DriverManager.getConnection(url,user,password);
    }
    private static String valor(Map<?,?> db,String key,String env,boolean permiteVacio) {
        String ambiente=System.getenv(env);
        Object v=ambiente!=null ? ambiente : db.get(key);
        if(!(v instanceof String s) || (!permiteVacio && s.isBlank()))
            throw new IllegalStateException("Propiedad inválida: database."+key);
        return s;
    }
}
