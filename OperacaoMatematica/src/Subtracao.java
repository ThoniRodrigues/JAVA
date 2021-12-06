/*  Cleiton, Kauê, José, Vitor 
    Trabalho B1 - CCS6A - 2017
    Exercicio 1
*/

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

class Subtracao implements OperacaoMatematica {
    public double x, y;
    DecimalFormat ft = new DecimalFormat("0.0000");
    
    public static void main (String args[]) {
        Subtracao menos = new Subtracao();
        menos.ler();
        menos.mostrar();
    }
        
    public void ler() { 
        x = Double.parseDouble(JOptionPane.showInputDialog("Subtração - Minuendo: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Subtração - Subtraendo: "));
    }
    public double calcula (double x, double y) {
        return x - y;
    }
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Subtração - Diferença: " + ft.format( calcula(x, y)   ));
    }
}