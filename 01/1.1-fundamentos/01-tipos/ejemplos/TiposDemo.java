package edu.ups.pap.u01;

import java.util.Objects;

public class TiposDemo {
    static final class Caja<T> {
        private final T valor;

        Caja(T valor) {
            this.valor = Objects.requireNonNull(valor);
        }

        T obtener() {
            return valor;
        }
    }

    record Sensor(String id, String ubicacion) {
    }

    public static void main(String[] args) {
        Caja<String> lugar = new Caja<>("Laboratorio 1");
        Caja<Integer> limite = new Caja<>(30);
        Caja<Sensor> dispositivo = new Caja<>(new Sensor("S01", lugar.obtener()));
        System.out.println(dispositivo.obtener().id() + " / " + lugar.obtener());
        System.out.println("Capacidad: " + limite.obtener());
        System.out.println(lugar.getClass() == limite.getClass());
        try {
            new Caja<String>(null);
        } catch (NullPointerException e) {
            System.out.println("Valor nulo rechazado");
        }
    }
}
