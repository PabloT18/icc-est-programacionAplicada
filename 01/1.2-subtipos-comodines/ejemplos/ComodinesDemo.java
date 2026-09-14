package edu.ups.pap.u01;
import java.util.*;
public class ComodinesDemo {
    static double sumar(List<? extends Number> valores) {
        double total = 0;
        for (Number n : valores) total += Objects.requireNonNull(n).doubleValue();
        return total;
    }
    static <T> void copiar(List<? extends T> origen, List<? super T> destino) {
        destino.addAll(origen);
    }
    public static void main(String[] args) {
        List<Integer> ocupacion = List.of(10,12,8);
        List<Number> acumulado = new ArrayList<>();
        copiar(ocupacion, acumulado);
        copiar(List.of(22.5,24.0), acumulado);
        System.out.println(acumulado);
        System.out.println("Total numérico: " + sumar(acumulado));
        List<Object> auditoria = new ArrayList<>();
        copiar(acumulado, auditoria);
        System.out.println("Elementos auditados: " + auditoria.size());
    }
}
