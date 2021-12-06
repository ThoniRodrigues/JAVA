/*  Cleiton, Kauê, José, Vitor 
    Trabalho B1 - CCS6A - 2017
    Exercicio 1
*/

public class Calculos {
    
    public static void main( String args[]) {
        Soma soma = new Soma();
        Subtracao menos = new Subtracao();
        Multiplicacao vezes = new Multiplicacao();
        Divisao div = new Divisao();
        
        soma.ler();
        soma.mostrar();
        menos.ler();
        menos.mostrar();
        vezes.ler();
        vezes.mostrar();
        div.ler();
        div.mostrar();
    }
    
}
