package edu.ups.pap.u03;
import java.util.concurrent.CountDownLatch;
public class HilosDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch iniciado = new CountDownLatch(1);
        Runnable recibir = () -> {
            try {
                System.out.println("Receptor iniciado");
                iniciado.countDown();
                while (!Thread.currentThread().isInterrupted()) Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally { System.out.println("Receptor cerrado"); }
        };
        Thread hilo = Thread.ofPlatform().name("receptor").unstarted(recibir);
        System.out.println(hilo.getState());
        hilo.start();
        iniciado.await();
        hilo.interrupt();
        hilo.join(2000);
        if (hilo.isAlive()) throw new IllegalStateException("No terminó a tiempo");
        System.out.println(hilo.getState());
    }
}
