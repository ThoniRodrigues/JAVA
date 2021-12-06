
public class Taxi extends Automovel {
    static String nomeCooperativa;
    String nroTaxi;
    
    Taxi () {
        nroTaxi = "A-021";
    }
    
    public void MostrarDadosTaxi() {
        System.out.println("Cooperativa: " + nomeCooperativa);
        System.out.println("Numero do Taxi: " + nroTaxi);
    }
    
    public static void main (String args[]) {
        Taxi.nomeCooperativa = "ABC";
        Taxi t = new Taxi();
        t.Automovel();
        t.MostrarDados();
        t.MostrarDadosTaxi();
    }
    
}
