import java.sql.*;

public class BancodeDados {
    
    public void Incluir() throws SQLException, ClassNotFoundException 
	{	              
        Connection conexao = ObterConexao();
        Statement statement = conexao.createStatement();
        String query = "insert into calculadora (valor1, valor2, op, resultado) values ("+ Calc.valor1 + 
                "," + Calc.valor2 + ", '" + Calc.sinal  + "' ," + Calc.res + ")";
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