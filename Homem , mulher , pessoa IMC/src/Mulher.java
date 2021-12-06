/*  Cleiton, Kauê, José, Vitor 
    Trabalho B1 - CCS6A - 2017
    Exercicio 2
*/

import javax.swing.JOptionPane;

public class Mulher extends PessoaIMC {
        static String n, d;
        static double p, a;

    public Mulher(String n, String d, double p, double a) {
        super(n,d,p,a);              
    }

    public static void main (String args[]){
        n = JOptionPane.showInputDialog("Nome: ");
        d = JOptionPane.showInputDialog("Data de nascimento: ");
        p = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        a = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        Mulher h = new Mulher(n, d, p, a);
        h.MostrarDados();
        h.resultadoIMC();
    }
    
    public void resultadoIMC() {
        double res = calculaIMC(p,a);
        if (res <= 19) {
            JOptionPane.showMessageDialog(null,"\nAbaixo do peso ideal. "); 
        }
        else {
            if (res > 19 && res <= 25.8) {
                JOptionPane.showMessageDialog(null,"\nPeso ideal. ");
            }
            else {
                JOptionPane.showMessageDialog(null,"\nAcima do peso ideal. ");
            }
        }
    }
}

