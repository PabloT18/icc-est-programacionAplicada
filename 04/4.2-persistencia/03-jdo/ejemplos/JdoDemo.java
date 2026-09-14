package edu.ups.pap.jdo;
import javax.jdo.*;
import java.util.*;
public class JdoDemo {
    public static void main(String[] args) {
        Map<String,String> p = new HashMap<>();
        p.put("javax.jdo.PersistenceManagerFactoryClass","org.datanucleus.api.jdo.JDOPersistenceManagerFactory");
        p.put("javax.jdo.option.ConnectionDriverName","org.h2.Driver");
        p.put("javax.jdo.option.ConnectionURL","jdbc:h2:mem:jdo;DB_CLOSE_DELAY=-1");
        p.put("javax.jdo.option.ConnectionUserName","sa");
        p.put("javax.jdo.option.ConnectionPassword","");
        p.put("datanucleus.schema.autoCreateAll","true");
        PersistenceManagerFactory pmf=JDOHelper.getPersistenceManagerFactory(p);
        try {
            PersistenceManager pm=pmf.getPersistenceManager();
            Transaction tx=pm.currentTransaction();
            try {tx.begin();pm.makePersistent(new JdoLectura(1,23.5));tx.commit();}
            finally {if(tx.isActive())tx.rollback();pm.close();}
            pm=pmf.getPersistenceManager();tx=pm.currentTransaction();
            try {
                tx.begin();
                JdoLectura lectura=pm.getObjectById(JdoLectura.class,1L);
                System.out.println("Lectura JDO: "+lectura.getValor());tx.commit();
            } finally {if(tx.isActive())tx.rollback();pm.close();}
        } finally {pmf.close();}
    }
}
