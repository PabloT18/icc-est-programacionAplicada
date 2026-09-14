package edu.ups.pap.u03;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
public class CoordinacionDemo {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier listas = new CyclicBarrier(4);
        Semaphore capacidad = new Semaphore(2);
        AtomicInteger completas = new AtomicInteger();
        Thread[] tareas = new Thread[4];
        for (int i=0;i<tareas.length;i++) {
            tareas[i] = new Thread(() -> {
                try {
                    listas.await();
                    capacidad.acquire();
                    try { Thread.sleep(20); completas.incrementAndGet(); }
                    finally { capacidad.release(); }
                } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                catch (BrokenBarrierException e) { System.err.println("Fase cancelada"); }
            });
            tareas[i].start();
        }
        for (Thread t : tareas) t.join();
        System.out.println("Completas: " + completas.get());
        System.out.println("Permisos: " + capacidad.availablePermits());
    }
}
