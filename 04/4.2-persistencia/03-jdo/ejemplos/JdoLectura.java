package edu.ups.pap.jdo;
import javax.jdo.annotations.*;
@PersistenceCapable(identityType=IdentityType.APPLICATION, detachable="true")
public class JdoLectura {
    @PrimaryKey private long id;
    private double valor;
    public JdoLectura() {}
    public JdoLectura(long id,double valor){this.id=id;this.valor=valor;}
    public long getId(){return id;}
    public double getValor(){return valor;}
}
