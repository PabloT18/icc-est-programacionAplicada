package edu.ups.pap.u01;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;
public class ReflexionDemo {
    @Retention(RetentionPolicy.RUNTIME) @Target(ElementType.TYPE)
    @interface Unidad { String value(); }
    interface Sensor { double leer(); }
    @Unidad("°C")
    public static class Temperatura implements Sensor {
        public Temperatura() {}
        public double leer() { return 23.5; }
    }
    static class Historial { List<Double> valores = new ArrayList<>(); }
    static <T> T crear(Class<T> tipo) throws ReflectiveOperationException {
        return tipo.getDeclaredConstructor().newInstance();
    }
    public static void main(String[] args) throws ReflectiveOperationException {
        Map<String,Class<? extends Sensor>> permitidos = Map.of("temp",Temperatura.class);
        Class<? extends Sensor> tipo = permitidos.get("temp");
        Sensor sensor = crear(tipo);
        System.out.println(sensor.leer() + " " + tipo.getAnnotation(Unidad.class).value());
        Type firma = Historial.class.getDeclaredField("valores").getGenericType();
        System.out.println(firma.getTypeName());
        System.out.println(new ArrayList<String>().getClass() == new ArrayList<Integer>().getClass());
    }
}
