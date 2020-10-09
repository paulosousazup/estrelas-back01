package br.com.zup.cidades;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.zup.connectionfactory.ConnectionFactory;

public class Cidades {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = new ConnectionFactory().getConnection();
		System.out.println("Conectado!");
		conn.close();
	}
	
}