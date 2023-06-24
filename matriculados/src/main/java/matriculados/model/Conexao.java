package matriculados.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	// parametros de conexão
		private static String driver = "com.mysql.cj.jdbc.Driver";
		private static String url = "jdbc:mysql://localhost:3306/universidade?useTimezone=true&serverTimezone=UTC";
		private static String user = "root";
		//coloque sua senha no lugar do asterisco
		private static String password = "*";

		// métodos de conexão
		static Connection conectar() {
			Connection con = null;
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				return con;
			} catch (Exception e) {
				System.out.println(e);
				return null;

			}

		}

}
