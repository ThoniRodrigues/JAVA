
public class Automovel implements iAutomovel {
    String placa;
    String modelo;
    String fabricante;
    
    public void Automovel() {
        placa = "ANL 1212";
        modelo = "Sedan";
        fabricante = "Ford";
        
    }
    
    public void MostrarDados () {
        System.out.println("Placa: " + placa);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
    }
    
}
