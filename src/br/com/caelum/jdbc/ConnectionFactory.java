package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {


	public Connection getConnection() {
		
		try {
			
			return DriverManager.getConnection("", "", "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
}
