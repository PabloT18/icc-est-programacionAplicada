package edu.ups.pap.u05;
import java.util.*;
public class SensoresDemo {
    static final class MediaMovil {
        private final int ventana;
        private final Deque<Double> valores = new ArrayDeque<>();
        private double suma;
        MediaMovil(int ventana) {
            if(ventana<=0)throw new IllegalArgumentException("Ventana inválida");
            this.ventana=ventana;
        }
        double agregar(double valor) {
            if(!Double.isFinite(valor))throw new IllegalArgumentException("Valor no finito");
            valores.addLast(valor);suma+=valor;
            if(valores.size()>ventana)suma-=valores.removeFirst();
            return suma/valores.size();
        }
    }
    static double calibrar(int raw,int minimo,int maximo) {
        if(maximo<=minimo)throw new IllegalArgumentException("Extremos inválidos");
        return 100.0*(raw-minimo)/(maximo-minimo);
    }
    public static void main(String[] args) {
        MediaMovil filtro=new MediaMovil(3);
        for(int raw:new int[]{100,300,500,700}) {
            double pct=calibrar(raw,100,900);
            System.out.printf(Locale.ROOT,"raw=%d pct=%.1f media=%.1f%n",raw,pct,filtro.agregar(pct));
        }
    }
}
