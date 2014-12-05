package com.db;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;

public class Db {
	public static Connection getConnection() throws URISyntaxException, SQLException {

	    URI dbUri = new URI(System.getenv("DATABASE_URL"));

	    String username = dbUri.getUserInfo().split(":")[0];
	    String password = dbUri.getUserInfo().split(":")[1];
	    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath();

	    return DriverManager.getConnection(dbUrl, username, password);
		

		
	}
}