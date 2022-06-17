package AtividadeDOJO.ComTela;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class ConexaoBD { 

	public static Connection criarConexao() throws SQLException{ 
	String url = "jdbc:mysql://localhost:3306/sistema_vendas"; //Nome da base de dados 
	String usuario = "root"; //nome do usuário do MySQL 
	String senha = "root"; //senha do MySQL 
	Connection conexao = null; 
	conexao = DriverManager.getConnection(url, usuario, senha); 
	
	return conexao; 
	} 
} 

