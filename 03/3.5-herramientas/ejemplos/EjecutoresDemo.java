package edu.ups.pap.u03;
import java.util.concurrent.*;
public class EjecutoresDemo {
    static double leer(double valor) {
        try { Thread.sleep(30); return valor; }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new CompletionException(e);
        }
    }
    public static void main(String[] args) throws Exception {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            CompletableFuture<Double> a = CompletableFuture.supplyAsync(() -> leer(22),executor);
            CompletableFuture<Double> b = CompletableFuture.supplyAsync(() -> leer(26),executor);
            CompletableFuture<Double> media = a.thenCombine(b,(x,y)->(x+y)/2);
            try { System.out.println("Media: " + media.get(2,TimeUnit.SECONDS)); }
            catch (TimeoutException e) {
                a.cancel(true); b.cancel(true);
                executor.shutdownNow();
                throw e;
            }
            Future<String> id = executor.submit(() -> "S01");
            System.out.println("Sensor: " + id.get());
        }
    }
}
