package com.webapp3rdyear.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectSQL {
	private static String USERNAME ="root";
	private static String PASSWORD = "Diemquynhankieng";
	private static String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/gardencentre";
	
	public static Connection getDatabaseConnection() throws  ClassNotFoundException, SQLException {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	
	public static void main (String[] args)
	{
		try {
			new DBConnectSQL();
				System.out.println(DBConnectSQL.getDatabaseConnection());
		
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
	}
}
