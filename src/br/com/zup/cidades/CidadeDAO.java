package br.com.zup.cidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.zup.connectionfactory.ConnectionFactory;

public class CidadeDAO {

	private Connection conn;

	public CidadeDAO() {
		this.conn = new ConnectionFactory().getConnection();
	}
	
	public boolean insereCidade () throws SQLException {
		
		String sql = "Insira uma Cidade"
				+ "(cep, nome, num_habitantes, capital, estado, renda_per_capta)"
				+ "values (?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setInt(0, 123);
		stmt.setString(1, "Manaus");
		
		
		stmt.execute();
		stmt.close();
		return true;
		
		
		
	}
}
