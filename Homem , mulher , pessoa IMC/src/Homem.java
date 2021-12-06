/*  Cleiton, Kauê, José, Vitor 
    Trabalho B1 - CCS6A - 2017
    Exercicio 2
*/

import javax.swing.JOptionPane;

public class Homem extends PessoaIMC {
        static String n, d;
        static double p, a;

    public Homem(String n, String d, double p, double a) {
        super(n,d,p,a);              
    }

    public static void main (String args[]){
        n = JOptionPane.showInputDialog("Nome: ");
        d = JOptionPane.showInputDialog("Data de nascimento: ");
        p = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        a = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        Homem h = new Homem(n, d, p, a);
        h.MostrarDados();
        h.resultadoIMC();
    }
    
    public void resultadoIMC() {
        double res = calculaIMC(getPeso(),getAltura() );
        if (res <= 20.7) {
            JOptionPane.showMessageDialog(null,"\nAbaixo do peso ideal. "); 
        }
        else {
            if (res > 20.7 && res <= 26.4) {
                JOptionPane.showMessageDialog(null,"\nPeso ideal. ");
            }
            else {
                JOptionPane.showMessageDialog(null,"\nAcima do peso ideal. ");
            }
        }
    }
}
