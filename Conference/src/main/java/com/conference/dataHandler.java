package com.conference;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dataHandler {

	private static final String URL = "jdbc:mysql://u2ec2vxohf6mmclk:c33IL6ob5zpNz5Z3eVZx@bgquldioujwgqak0xwgp-mysql.services.clever-cloud.com:3306/bgquldioujwgqak0xwgp";
	private static final String USERNAME = "u2ec2vxohf6mmclk";
   
	private static final String PASSWORD = "c33IL6ob5zpNz5Z3eVZx";
	 private static Connection conn;
	 
	 
	 public static Connection getConnection()  {
		 if (conn==null) {
			 
			 try {
				 Class.forName("com.mysql.jdbc.Driver");
				conn=   DriverManager.getConnection(URL, USERNAME, PASSWORD);
				System.out.println("connected successfuly");
			} catch (SQLException | ClassNotFoundException e ) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} }else {
				System.out.println("connection already opened");
			}
		 
	 return conn;}
	 
	 public static void closeConnection() {
		 try {
			conn.close();
			 conn= null;
				System.out.println("connection closed  successfuly");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("problem in closing connection");

		}
		

	 }
}
