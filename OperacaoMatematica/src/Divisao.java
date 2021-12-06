/*  Cleiton, Kauê, José, Vitor 
    Trabalho B1 - CCS6A - 2017
    Exercicio 1
*/

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

class Divisao implements OperacaoMatematica {
    public double x, y;
    DecimalFormat ft = new DecimalFormat("0.0000");
    
    public static void main (String args[]) {
        Divisao dividido = new Divisao();
        dividido.ler();
        dividido.mostrar();
    }
        
    public void ler() { 
        y = 0;
        x = Double.parseDouble(JOptionPane.showInputDialog("Divisão - Dividendo: "));
        while (y == 0 ) {
            y = Double.parseDouble(JOptionPane.showInputDialog("Divisão - Divisor: "));
            if (y == 0 ) {
                JOptionPane.showMessageDialog(null, "O divisor não pode ser ZERO.");
            }
        }
    }
    public double calcula (double x, double y) {
        return x / y;
    }
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Divisão - Quociente: " + ft.format( calcula(x, y)   ));
    }
}
