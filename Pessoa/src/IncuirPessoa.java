import javax.swing.JOptionPane;
class IncluirPessoa {

// Atributos  
     private String Cpf;   
     private String Nome;
     private String Cidade;
     private int AnoNasc, Idade;
    

// Metodos
      IncluirPessoa(String Nome, String Cpf, String Cidade, int AnoNasc, int Idade) { 
       this.Nome = Nome;
       this.Cpf = Cpf;
       this.Cidade = Cidade;
       this.AnoNasc = AnoNasc;
       this.Idade = Idade;
    }; 
    /*
    void  CadastrarPessoa(String Nome, String Cpf, int Idade) { 
       this.Nome = Nome;
       this.Cpf = Cpf;
       this.Idade = Idade;
    };
    void  CadastrarPessoa(String Nome, String Cpf, String Cidade) { 
       this.Nome = Nome;
       this.Cpf = Cpf;
       this.Cidade = Cidade;
    };   
    
   */
   public void ImprimirPessoa()   {
       System.out.println("Nome: " + Nome);
       System.out.println("Cpf: " + Cpf);
       System.out.println("Ano Nascimento: " + AnoNasc);
       System.out.println("Cidade: " + Cidade);
       System.out.println("Idade: " + Idade + "\n");
   };
   /* void CalcularIdade()   {
       Idade = 2017 - AnoNasc;
   }; */
 
   public static void main(String[] args) {

         IncluirPessoa p = new IncluirPessoa("Jose", "9999","Maua",2000,17);
         p.ImprimirPessoa();
         //p.CadastrarPessoa("Jose", "939339", 100);
         // p.CalcularIdade();
         p.ImprimirPessoa();
         
         //IncluirPessoa z = new IncluirPessoa();
         //z.CadastrarPessoa("Pedro","845968","Ribeirao Pires");
         //z.CalcularIdade();
         //z.ImprimirPessoa();
    }
}
