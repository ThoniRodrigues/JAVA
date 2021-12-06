import java.sql.*;

public class BancoDados {
    
    static String eNome;
    static String eSexo;
    public void Incluir() throws SQLException, ClassNotFoundException 
	{	              
        Connection conexao = ObterConexao();
        Statement statement = conexao.createStatement();
        String query = "insert into funcionario (Matricula, Nome, Sexo) values ( "+ InclusaoFunc.Matricula + 
                "," + InclusaoFunc.Nome + "," + InclusaoFunc.Sexo  +")";
        ResultSet resultSet;
        resultSet = statement.executeQuery(query);
        System.out.println("Registro Incluido");
         }
    public void Consultar(String cMatric) throws SQLException, ClassNotFoundException 
	{	              
        Connection conexao = ObterConexao();
        Statement statement = conexao.createStatement();
        String query = "select nome, sexo from funcionario where matricula = " + cMatric ;
        ResultSet resultSet;
        resultSet = statement.executeQuery(query);
        while (resultSet.next() ){
            eNome = resultSet.getString("nome");
            eSexo = resultSet.getString("sexo");
            }
        }    
    public static Connection ObterConexao() throws ClassNotFoundException, SQLException  
	{
        Connection conexao = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "re790707");
        return conexao;
        }
    public void Excluir() throws SQLException, ClassNotFoundException 
	{	              
        Connection conexao = ObterConexao();
        Statement statement = conexao.createStatement();
        String query = "delete from funcionario where Matricula = "+ ExcluirFunc.Matr ;
        ResultSet resultSet;
        resultSet = statement.executeQuery(query);
        System.out.println("Registro Excluido");
         }   

    public void Alterar() throws SQLException, ClassNotFoundException 
	{	              
        Connection conexao = ObterConexao();
        Statement statement = conexao.createStatement();
        String query = "update funcionario set matricula = '" + AlterarFunc.altMatr1 + "' , nome = '" + AlterarFunc.altNome1 + "' , sexo = '" 
                + AlterarFunc.altSexo1 +"'";
        ResultSet resultSet;
        resultSet = statement.executeQuery(query);
        System.out.println("Registro Incluido");
         }

}


