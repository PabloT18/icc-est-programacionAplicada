package edu.ups.pap.u05;
import edu.ups.pap.comun.Protocolo;
import com.fazecast.jSerialComm.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
public class SerialDemo {
    static void recibir(InputStream in, long duracionMs) throws IOException {
        var decoder = new Protocolo.Decodificador(80);
        long fin = System.nanoTime() + duracionMs * 1_000_000L;
        while (System.nanoTime() < fin) {
            int b;
            try {b=in.read();} catch(SerialPortTimeoutException e) {continue;}
            if(b<0) break;
            try {
                String linea = decoder.aceptar(b);
                if(linea!=null) System.out.println(Protocolo.parsear(linea));
            } catch(IllegalArgumentException e) {System.out.println("Rechazo: "+e.getMessage());}
        }
    }
    public static void main(String[] args) throws Exception {
        if(args.length==0 || args[0].equals("--simulate")) {
            try(var in=new ByteArrayInputStream("DATA;1;512\nACK;LED;1\nMAL\n".getBytes(StandardCharsets.US_ASCII))) {
                recibir(in,1000);
            }
            return;
        }
        if(args.length!=2 || !args[0].equals("--port")) throw new IllegalArgumentException("Uso: --simulate | --port PUERTO");
        SerialPort puerto=SerialPort.getCommPort(args[1]);
        puerto.setComPortParameters(115200,8,SerialPort.ONE_STOP_BIT,SerialPort.NO_PARITY);
        puerto.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING,300,0);
        if(!puerto.openPort()) throw new IOException("No se pudo abrir el puerto");
        try(InputStream in=puerto.getInputStream();OutputStream out=puerto.getOutputStream()) {
            recibir(in,2200);
            out.write("SET;LED;1\n".getBytes(StandardCharsets.US_ASCII));out.flush();
            recibir(in,3000);
        } finally {puerto.closePort();}
    }
}
