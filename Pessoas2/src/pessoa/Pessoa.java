package pessoa;

class Pessoa {
    // atributos
    private String Nome;
    private String Cpf;
    private int AnoNasc;
    //metodos
    public void CadastrarPessoa(){ 
        Nome = "Jose da Silva"; 
        Cpf = "02334567810";
        AnoNasc = 1980;
    }
    public void ImprimirPessoa(){ 
        System.out.println ("Nome: " + Nome);
        System.out.println ("Cpf: " + Cpf);
        System.out.println ("Ano :"+ AnoNasc);
    }
        public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.CadastrarPessoa();
        // p.ImprimirPessoa();        
        
        PessoaFisica PF = new PessoaFisica();
        PF.CadastrarPessoa();
        PF.IncluirPessoaFisica();
        PF.ImprimirPessoa();
        PF.ImprimePF();
    } 
}