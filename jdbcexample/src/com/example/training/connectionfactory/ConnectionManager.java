package com.example.training.connectionfactory;

import java.sql.*;

public class ConnectionManager {
	
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/mydb";
	   
	  // static final String DB_URL = "jdbc:mysql://<IPADDRESS>/user";
	   
	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	
	private static Connection connection = null;
	
	public static Connection getConnection()
	{
		if(connection==null)
		{
			try {
				
				Class.forName(JDBC_DRIVER); // Loading the driver
				
				// Getting the connection from DriverManager
				connection = DriverManager.getConnection(DB_URL,USER,PASS);
				
			} catch (Exception e) {
				System.out.println("Exception while creating JDBC connection "+ e);
			}
				
		}
		return connection;
	}

}
