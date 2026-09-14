package edu.ups.pap.u03;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
public class ColaDemo {
    record Mensaje(int valor, boolean fin) {}
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Mensaje> cola = new ArrayBlockingQueue<>(4);
        AtomicInteger suma = new AtomicInteger(), cantidad = new AtomicInteger();
        Runnable consumir = () -> {
            try {
                while (true) {
                    Mensaje m = cola.take();
                    if (m.fin()) return;
                    suma.addAndGet(m.valor()); cantidad.incrementAndGet();
                }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        };
        Thread a = new Thread(consumir), b = new Thread(consumir);
        a.start(); b.start();
        for (int i=1;i<=10;i++) cola.put(new Mensaje(i,false));
        cola.put(new Mensaje(0,true)); cola.put(new Mensaje(0,true));
        a.join(); b.join();
        System.out.println("Cantidad: " + cantidad.get());
        System.out.println("Suma: " + suma.get());
    }
}
