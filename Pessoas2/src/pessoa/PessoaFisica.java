package pessoa;

public class PessoaFisica extends Pessoa {
    String Sexo;
    int RG;
    byte Idade;
    
    public void IncluirPessoaFisica(){
        Sexo = "Masculino";
        RG = 9366755;
        Idade = 16;
    }
    public void ImprimePF() {
        System.out.println ("Sexo :" + Sexo);
        System.out.println ("RG :" + RG);
        System.out.println ("Idade :" + Idade);
    }
      
}