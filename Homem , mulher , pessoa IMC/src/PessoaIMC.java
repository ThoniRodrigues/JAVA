/*  Cleiton, Kauê, José, Vitor 
    Trabalho B1 - CCS6A - 2017
    Exercicio 2
*/

import javax.swing.JOptionPane;

abstract class PessoaIMC extends Pessoa {
    protected double peso;
    protected double altura;
    double IMC;
    
    public PessoaIMC(String n, String d, double p, double a) {
        super(n, d);
        peso = p;
        altura = a;
    }
    
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }  
    
    public double calculaIMC(double p, double a) {
        return IMC = (p / (a * a));
    }
    public void MostrarDados () {
        JOptionPane.showMessageDialog(null, 
                "Nome: " + nome + 
                "\nData de Nascimento: " + dataNascimento +
                "\nPeso: " + peso +
                "\nAltura: " + altura);
    }
    abstract public void resultadoIMC ();
    
}