package matriculados.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import matriculados.model.JavaBeans;

public class DAO {
	public void inserirContato(JavaBeans contato) {
		String create = "insert into ´contatos´ (nome, fone, email) values (?, ?, ?)";
		try {
			// Abrir a conexão com o banco de dados
			Connection cone = Conexao.conectar();
			// Preparara a query para a execução no banco de dados
			PreparedStatement pst = cone.prepareStatement(create);
			// Substituir os parámetros(?) pelo conteúdo das variáveis JavaBeans
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			// Executar a query
			pst.executeUpdate();
			// Encerrar a conexão
			cone.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/* CRUD READ */

	public ArrayList<JavaBeans> listarContatos() {
		String ler = "select * from ´turma´ order by nome";
		// JavaBeans contato = new JavaBeans();
		ArrayList<JavaBeans> lista = new ArrayList<>();
		try {
			// Abrir a conexão com o banco de dados
			Connection cone = Conexao.conectar();
			// Preparara a query para a execução no banco de dados
			PreparedStatement pst = cone.prepareStatement(ler);
			ResultSet resultado = pst.executeQuery();
			while (resultado.next()) {
				String idcon = resultado.getString(1);
				String nome = resultado.getString(2);
				String fone = resultado.getString(3);
				String email = resultado.getString(4);
				lista.add(new JavaBeans(ensalamento, matricula, nomeAluno, nomeCurso, disciplina, nomeTurma));
			}

			// Encerrar a conexão
			cone.close();
			return lista;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	// CRUD UPDATE

	// Selecionar o contato
	public void selecionarContato(JavaBeans contato) {

		String read2 = "select * from ´contatos´ where idcon= ?";
		try {
			Connection cone = Conexao.conectar();
			PreparedStatement pst = cone.prepareStatement(read2);
			pst.setString(1, contato.getIdcon());
			ResultSet resultado = pst.executeQuery();
			while (resultado.next()) {
				// Setar as variáveis JavaBeans
				contato.setIdcon(resultado.getString(1));
				contato.setNome(resultado.getString(2));
				contato.setFone(resultado.getString(3));
				contato.setEmail(resultado.getString(4));
			}
			cone.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Editar um contato

	public void alterarContato(JavaBeans contato) {
		String create = "update ´contatos´ set nome= ?, fone= ?, email= ? where idcon= ?";

		try {
			Connection cone = Conexao.conectar();
			PreparedStatement pst = cone.prepareStatement(create);
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			pst.setString(4, contato.getIdcon());
			// Executar a query
			pst.executeUpdate();
			// Encerrar a conexão
			cone.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Deletar um Contato
	public void deletarContato(JavaBeans contato) {
		String delete = "delete from ´contatos´ where idcon = ?";

		try {
			Connection cone = Conexao.conectar();
			PreparedStatement pst = cone.prepareStatement(delete);
			pst.setString(1, contato.getIdcon());
			// Executar a query
			pst.executeUpdate();
			// Encerrar a conexão
			cone.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}


}
