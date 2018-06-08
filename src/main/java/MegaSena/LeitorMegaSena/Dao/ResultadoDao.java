package MegaSena.LeitorMegaSena.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import MegaSena.LeitorMegaSena.ConnectionFactory;
import MegaSena.LeitorMegaSena.modelo.Resultado;

public class ResultadoDao {

	private Connection connection;

	public ResultadoDao() throws SQLException {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adicionaResultado(Resultado resultado) {
		String sql = "insert into tbl_resultados"
				+ "(Concurso, Dezena_1, Dezena_2, Dezena_3, Dezena_4, Dezena_5, Dezena_6)"
				+ " values (?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, resultado.getConcurso());
			stmt.setLong(3, resultado.getDezena_1());
			stmt.setLong(4, resultado.getDezena_2());
			stmt.setLong(5, resultado.getDezena_3());
			stmt.setLong(6, resultado.getDezena_4());
			stmt.setLong(7, resultado.getDezena_5());
			stmt.setLong(8, resultado.getDezena_6());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
