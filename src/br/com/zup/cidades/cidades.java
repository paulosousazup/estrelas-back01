package br.com.zup.cidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class cidades {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root"
				+ "/estrelas");
				System.out.println("Conectado!");
				conn.close();
	}

}