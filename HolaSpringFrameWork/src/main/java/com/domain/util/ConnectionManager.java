package com.domain.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static Connection connection;

	public ConnectionManager() {
	}

	public static void connect() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inetum", "root", "AMV$1984Curso");

	}

	public static void disconnect() throws SQLException {
		connection.close();
	}

	public static Connection getConnexion() {
		return connection;
	}

}
