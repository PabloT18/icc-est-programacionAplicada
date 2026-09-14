package edu.ups.pap.comun;
import java.util.*;
import java.nio.charset.StandardCharsets;
public class ProtocoloCheck {
    public static void main(String[] args) {
        var dec=new Protocolo.Decodificador(80);
        List<Protocolo.Mensaje> recibidos=new ArrayList<>();
        String[] fragmentos={"DA","TA;1;512\r","\nACK;LED;1\n","x".repeat(81)+"\nDATA;2;0\n"};
        int errores=0;
        for(String fragmento:fragmentos)for(byte b:fragmento.getBytes(StandardCharsets.US_ASCII)) {
            try {String linea=dec.aceptar(b & 255);if(linea!=null)recibidos.add(Protocolo.parsear(linea));}
            catch(IllegalArgumentException e){errores++;}
        }
        if(recibidos.size()!=3 || errores!=1)throw new AssertionError("Delimitación incorrecta");
        if(!recibidos.getFirst().equals(new Protocolo.Dato(1,512)))throw new AssertionError();
        for(String invalida:List.of("DATA;4294967296;1","DATA;1;1024","ACK;LED;2","DATA;1;-1")) {
            try{Protocolo.parsear(invalida);throw new AssertionError(invalida);}
            catch(IllegalArgumentException esperada){}
        }
        System.out.println("Protocolo: fragmentación, concatenación, límites y recuperación correctos");
    }
}
