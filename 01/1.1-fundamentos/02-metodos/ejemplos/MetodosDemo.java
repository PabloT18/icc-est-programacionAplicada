package edu.ups.pap.u01;
import java.util.*;
public class MetodosDemo {
    record Medicion(String sensor, double valor) {}
    static <T> Optional<T> maximo(List<T> datos, Comparator<? super T> orden) {
        Objects.requireNonNull(datos);
        Objects.requireNonNull(orden);
        T mejor = null;
        for (T actual : datos) {
            Objects.requireNonNull(actual, "No se admiten elementos nulos");
            if (mejor == null || orden.compare(actual, mejor) > 0) mejor = actual;
        }
        return Optional.ofNullable(mejor);
    }
    public static void main(String[] args) {
        var datos = List.of(new Medicion("S01",22.5), new Medicion("S02",27.2),
                            new Medicion("S03",24.0));
        var orden = Comparator.comparingDouble(Medicion::valor);
        System.out.println(maximo(datos, orden).orElseThrow());
        System.out.println(maximo(List.<Medicion>of(), orden));
        System.out.println(maximo(List.of("Aula", "Laboratorio"),
                                  Comparator.comparingInt(String::length)).orElseThrow());
    }
}
