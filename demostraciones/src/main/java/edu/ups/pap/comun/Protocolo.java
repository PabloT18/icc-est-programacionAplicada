package edu.ups.pap.comun;
import java.util.regex.*;
public final class Protocolo {
    private Protocolo() {}
    public sealed interface Mensaje permits Dato,Ack,Error {}
    public record Dato(long secuencia,int raw) implements Mensaje {}
    public record Ack(boolean encendido) implements Mensaje {}
    public record Error(String causa) implements Mensaje {}
    private static final Pattern DATA=Pattern.compile("DATA;([0-9]{1,10});([0-9]{1,4})");
    private static final Pattern ACK=Pattern.compile("ACK;LED;([01])");
    public static Mensaje parsear(String linea) {
        if(linea.length()>80)throw new IllegalArgumentException("Trama demasiado larga");
        Matcher m=DATA.matcher(linea);
        if(m.matches()) {
            long seq=Long.parseLong(m.group(1));int raw=Integer.parseInt(m.group(2));
            if(seq>0xffff_ffffL || raw>1023)throw new IllegalArgumentException("Dato fuera de rango UNO R3");
            return new Dato(seq,raw);
        }
        m=ACK.matcher(linea);
        if(m.matches())return new Ack(m.group(1).equals("1"));
        if(linea.equals("ERR;CMD"))return new Error("CMD");
        throw new IllegalArgumentException("Formato de trama inválido");
    }
    public static final class Decodificador {
        private final int maximo;
        private final StringBuilder buffer=new StringBuilder();
        private boolean descartar;
        public Decodificador(int maximo) {
            if(maximo<1)throw new IllegalArgumentException("Longitud inválida");
            this.maximo=maximo;
        }
        public String aceptar(int b) {
            if(b<0 || b>255)throw new IllegalArgumentException("Byte inválido");
            if(b=='\n') {
                if(descartar) {buffer.setLength(0);descartar=false;throw new IllegalArgumentException("Línea descartada por longitud o codificación");}
                String linea=buffer.toString();buffer.setLength(0);
                if(linea.endsWith("\r"))linea=linea.substring(0,linea.length()-1);
                if(linea.length()>maximo || linea.indexOf('\r')>=0)throw new IllegalArgumentException("Terminador inválido");
                return linea;
            }
            if(descartar)return null;
            if(b>127 || (b<32 && b!='\r')) {buffer.setLength(0);descartar=true;return null;}
            // Un carácter adicional permite CR después de 80 caracteres.
            if(buffer.length()>=maximo && !(buffer.length()==maximo && b=='\r')) {
                buffer.setLength(0);descartar=true;return null;
            }
            buffer.append((char)b);return null;
        }
    }
}
