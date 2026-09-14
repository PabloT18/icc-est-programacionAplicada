package edu.ups.pap.u01;
import java.util.*;
public class BoxingDemo {
    @SafeVarargs
    static <T> List<T> lote(T... valores) {
        Objects.requireNonNull(valores, "Arreglo nulo");
        List<T> copia = new ArrayList<>();
        for (T valor : valores) copia.add(Objects.requireNonNull(valor, "Elemento nulo"));
        return List.copyOf(copia);
    }
    static OptionalDouble promedio(List<Double> valores) {
        if (valores.isEmpty()) return OptionalDouble.empty();
        double suma = 0;
        for (Double valor : valores) suma += Objects.requireNonNull(valor);
        return OptionalDouble.of(suma / valores.size());
    }
    public static void main(String[] args) {
        var temperaturas = lote(22.0, 24.0, 26.0);
        System.out.println(promedio(temperaturas).orElseThrow());
        System.out.println("Argumentos de consola: " + args.length);
        System.out.println(promedio(List.of()));
        try { lote(22.0, null); }
        catch (NullPointerException e) { System.out.println(e.getMessage()); }
    }
}
