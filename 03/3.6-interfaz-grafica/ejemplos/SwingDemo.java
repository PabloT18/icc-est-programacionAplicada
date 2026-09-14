package edu.ups.pap.u03;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.concurrent.*;
public class SwingDemo {
    static int calcular() { return java.util.stream.IntStream.rangeClosed(1,10).sum(); }
    public static void main(String[] args) {
        if (args.length>0 && args[0].equals("--self-test")) {
            if (calcular()!=55) throw new AssertionError();
            System.out.println("Cálculo: 55"); return;
        }
        SwingUtilities.invokeLater(() -> {
            JFrame ventana = new JFrame("CampusMonitor");
            JLabel estado = new JLabel("Listo");
            JButton iniciar = new JButton("Importar"), cancelar = new JButton("Cancelar");
            cancelar.setEnabled(false);
            final java.util.concurrent.atomic.AtomicReference<SwingWorker<Integer,Integer>> actual = new java.util.concurrent.atomic.AtomicReference<>();
            iniciar.addActionListener(evento -> {
                iniciar.setEnabled(false); cancelar.setEnabled(true);
                actual.set(new SwingWorker<Integer,Integer>() {
                    protected Integer doInBackground() throws Exception {
                        for(int i=1;i<=10;i++) {
                            if(isCancelled()) return 0;
                            Thread.sleep(80); publish(i);
                        }
                        return calcular();
                    }
                    protected void process(List<Integer> lotes) {
                        estado.setText("Procesadas: "+lotes.getLast());
                    }
                    protected void done() {
                        try { estado.setText("Suma: "+get()); }
                        catch(CancellationException e) { estado.setText("Cancelado"); }
                        catch(InterruptedException e) { Thread.currentThread().interrupt(); }
                        catch(ExecutionException e) { estado.setText("Error: "+e.getCause().getMessage()); }
                        finally { iniciar.setEnabled(true); cancelar.setEnabled(false); }
                    }
                });
                actual.get().execute();
            });
            cancelar.addActionListener(e -> { if(actual.get()!=null) actual.get().cancel(true); });
            ventana.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) { if(actual.get()!=null) actual.get().cancel(true); }
            });
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventana.setLayout(new FlowLayout());
            ventana.add(iniciar);ventana.add(cancelar);ventana.add(estado);
            ventana.setSize(420,140);ventana.setLocationRelativeTo(null);ventana.setVisible(true);
        });
    }
}
