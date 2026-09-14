package edu.ups.pap.u03;
import java.io.*;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;
public class ProcesosDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean windows = System.getProperty("os.name").toLowerCase().contains("win");
        String java = Path.of(System.getProperty("java.home"),"bin",windows?"java.exe":"java").toString();
        ProcessBuilder pb = windows ? new ProcessBuilder(java,"--version") : new ProcessBuilder("uname","-s");
        Path salida = Files.createTempFile("diagnostico-", ".txt");
        Process proceso = null;
        try {
            proceso = pb.redirectErrorStream(true).redirectOutput(salida.toFile()).start();
            if (!proceso.waitFor(3,TimeUnit.SECONDS)) {
                proceso.destroy();
                if (!proceso.waitFor(1,TimeUnit.SECONDS)) { proceso.destroyForcibly(); proceso.waitFor(); }
                throw new IOException("Tiempo de diagnóstico agotado");
            }
            if (proceso.exitValue()!=0) throw new IOException("Código de salida: "+proceso.exitValue());
            System.out.print(Files.readString(salida));
        } finally {
            if (proceso!=null && proceso.isAlive()) proceso.destroyForcibly();
            Files.deleteIfExists(salida);
        }
    }
}
