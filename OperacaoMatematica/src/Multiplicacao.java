/*  Cleiton, Kauê, José, Vitor 
    Trabalho B1 - CCS6A - 2017
    Exercicio 1
*/

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

class Multiplicacao implements OperacaoMatematica {
    public double x, y;
    DecimalFormat ft = new DecimalFormat("0.0000");
    
    public static void main (String args[]) {
        Multiplicacao vezes = new Multiplicacao();
        vezes.ler();
        vezes.mostrar();
    }
        
    public void ler() { 
        x = Double.parseDouble(JOptionPane.showInputDialog("Multiplicação - Primeiro fator: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Multiplicação - Segundo fator: "));
    }
    public double calcula (double x, double y) {
        return x * y;
    }
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Multiplicação - Produto: " + ft.format( calcula(x, y)   ));
    }
}