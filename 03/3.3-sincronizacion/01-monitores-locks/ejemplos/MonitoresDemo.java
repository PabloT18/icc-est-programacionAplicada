package edu.ups.pap.u03;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
public class MonitoresDemo {
    static final class Registro {
        private final Object lock = new Object();
        private final Set<String> ids = new HashSet<>();
        boolean registrar(String id) {
            synchronized (lock) {
                if (ids.contains(id)) return false;
                ids.add(id); return true;
            }
        }
        int cantidad() { synchronized(lock) { return ids.size(); } }
    }
    public static void main(String[] args) throws InterruptedException {
        Registro registro = new Registro();
        AtomicInteger exitos = new AtomicInteger();
        Runnable insertar = () -> { if (registro.registrar("S01")) exitos.incrementAndGet(); };
        Thread a = new Thread(insertar), b = new Thread(insertar);
        a.start(); b.start(); a.join(); b.join();
        System.out.println("Registros: " + registro.cantidad());
        System.out.println("Inserciones exitosas: " + exitos.get());
    }
}
