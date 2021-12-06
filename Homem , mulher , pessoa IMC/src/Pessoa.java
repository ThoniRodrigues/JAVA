/*  Cleiton, Kauê, José, Vitor 
    Trabalho B1 - CCS6A - 2017
    Exercicio 2
*/

import javax.swing.JOptionPane;

public class Pessoa {
    protected String nome;
    protected String dataNascimento;
    
    public Pessoa (String n, String d) {
        nome = n;
        dataNascimento = d;
    }
    
    public void MostrarPessoa () {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nData de Nascimento: " + dataNascimento);
    }

}

