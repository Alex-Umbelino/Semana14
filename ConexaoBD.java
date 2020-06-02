import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

   public Connection obtemConexao() throws SQLException {
      String servidor = "localhost";
      String porta = "3306";
      String database = "Jtable";
      String usuario = "root";
      String senha = "alexrock007";
      return DriverManager
         	.getConnection("jdbc:mysql://"+servidor+":"+porta+"/"+database+"?user="+usuario+"&password="+senha+"&useTimezone=true&serverTimezone=America/Sao_Paulo");
   }
}