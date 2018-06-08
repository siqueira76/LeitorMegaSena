package MegaSena.LeitorMegaSena;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		Connection con = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta com sucesso");
		con.close();

	}

}
