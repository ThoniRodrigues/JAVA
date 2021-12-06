
import java.sql.*;

public class Consulta {
    String Nome;
    
    public void BuscarProduto() throws SQLException, ClassNotFoundException {	
        Connection conexao = ObterConexao();
        Statement statement = conexao.createStatement();
        String query = "SELECT first_name, last_name, salary FROM employees where employee_id="+CadastroFuncionario.cd_Func;
        ResultSet resultSet = statement.executeQuery(query);
            
        while (resultSet.next()) {	
            System.out.println(resultSet.getString("first_name")+" "+resultSet.getString("last_name")+ " "+resultSet.getString("salary") );
//          Nome = resultSet.getString("first_name")+" "+resultSet.getString("last_name") ;
        }
    }
    public static Connection ObterConexao() throws ClassNotFoundException, SQLException  {
        Connection conexao = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "re790707");
        return conexao;
    }
    
    public static void main (String [] args  ) { 
        Consulta Co = new Consulta();
        try{
            Co.BuscarProduto();
        }  catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        } catch (ClassNotFoundException ex ) {
            System.out.println(ex.getMessage());
        }
    }
}