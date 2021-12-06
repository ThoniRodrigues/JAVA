import java.sql.*;

public class BancoDados {
    
    static String eNome;
    static String eSexo;
    public void Incluir() throws SQLException, ClassNotFoundException 
	{	              
        Connection conexao = ObterConexao();
        Statement statement = conexao.createStatement();
        String query = "insert into func (matricula, nome, sexo, departamento, cargo, funcao) values ( "+ IncluirFunc.Matricula + 
                "," + IncluirFunc.Nome + "," + IncluirFunc.Sexo  + "," + IncluirFunc.Departamento +
                "," + IncluirFunc.Cargo + "," + IncluirFunc.Funcao + ")";
        ResultSet resultSet;
        resultSet = statement.executeQuery(query);
        System.out.println("Registro Incluido");
         }
   
    public static Connection ObterConexao() throws ClassNotFoundException, SQLException  
	{
        Connection conexao = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "re790707");
        return conexao;
        }
}
