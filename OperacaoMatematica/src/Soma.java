/*  Cleiton, Kauê, José, Vitor 
    Trabalho B1 - CCS6A - 2017
    Exercicio 1
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class Soma implements OperacaoMatematica {
    public double x, y;
    DecimalFormat ft = new DecimalFormat("0.0000");
    
    public static void main (String args[]) {
        Soma soma = new Soma();
        soma.ler();
        soma.mostrar();
    }
    public void ler() { 
        x = Double.parseDouble(JOptionPane.showInputDialog("Soma - Primeira parcela: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Soma - Segunda parcela: "));
    }
    public double calcula (double x, double y) {
        return x + y;
    }
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Soma - Total: " + ft.format( calcula(x, y)   ) );
    }
}
