package AtividadeDOJO.ComTela;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
	public static List<Aluno> buscaAluno() {
		Connection conn;
		List<Aluno> alunos = new ArrayList<Aluno>();
		try {
			conn = ConexaoBD.criarConexao();
			String sql = "select * from cliente";
			PreparedStatement ps = conn.prepareStatement(sql); // Executa o comando de consulta aonde guarda os dados
																// retornados dentro do ResultSet.
			// Pelo fato de gerar uma lista de valores, é necessário percorrer os dados
			// através do laço while

			ResultSet rs = ps.executeQuery(); // Faz a verificação de enquanto conter registros, percorre e resgata os
												// valores

			while (rs.next()) { // Recupera valor referente ao nome da coluna
				Aluno aluno = new Aluno();
				aluno.setNome(rs.getString("nome"));
				aluno.setCurso(rs.getString("cidade"));
				alunos.add(aluno);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alunos;

	}
}
