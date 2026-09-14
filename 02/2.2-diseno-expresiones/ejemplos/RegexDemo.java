package edu.ups.pap.u02;
import java.util.regex.*;
public class RegexDemo {
    record Trama(String sensor, double valor, String unidad) {}
    static final Pattern P = Pattern.compile(
        "(?<sensor>S[0-9]{2});(?<valor>-?[0-9]+(?:[.][0-9]+)?);(?<unidad>C|PCT)");
    static Trama parsear(String linea) {
        if (linea.length() > 80) throw new IllegalArgumentException("Trama demasiado larga");
        Matcher m = P.matcher(linea);
        if (!m.matches()) throw new IllegalArgumentException("Formato inválido");
        double valor = Double.parseDouble(m.group("valor"));
        if (!Double.isFinite(valor)) throw new IllegalArgumentException("Valor no finito");
        return new Trama(m.group("sensor"),valor,m.group("unidad"));
    }
    public static void main(String[] args) {
        for (String s : new String[]{"S01;23.5;C","S02;-2;C","S1;22;C","S01;NaN;C"}) {
            try { System.out.println(parsear(s)); }
            catch (IllegalArgumentException e) { System.out.println(s + ": " + e.getMessage()); }
        }
    }
}
