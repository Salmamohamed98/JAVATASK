package com.conference;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserManager {
	
public static Boolean registerNewUser(User user) {
	Connection conn = dataHandler.getConnection();
	String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
	 PreparedStatement ps;
	try {
		 ps = conn.prepareStatement(sql);
		 ps.setString(1, user.getName());
		 ps.setString(2,user.getPassword());
		 ps.setString(3, user.getEmail());
		 int isInserted = ps.executeUpdate();      
		if(isInserted>0) {
	       System.out.println(" successfully.");
	   return true;
		}else {
	     	System.out.print("faild");
	   	return false;
	   }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
  return false;    
}
}
