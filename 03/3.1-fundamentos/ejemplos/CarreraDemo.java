package edu.ups.pap.u03;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
public class CarreraDemo {
    static int contador;
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrera = new CyclicBarrier(2);
        AtomicInteger seguro = new AtomicInteger();
        Runnable tarea = () -> {
            int anterior = contador;
            try { barrera.await(); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); return; }
            catch (BrokenBarrierException e) { throw new IllegalStateException(e); }
            contador = anterior + 1;
            seguro.incrementAndGet();
        };
        Thread a = new Thread(tarea), b = new Thread(tarea);
        a.start(); b.start(); a.join(); b.join();
        System.out.println("Sin operación atómica: " + contador);
        System.out.println("Con AtomicInteger: " + seguro.get());
    }
}
