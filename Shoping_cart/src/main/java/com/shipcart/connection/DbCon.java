package com.shipcart.connection;

import java.sql.Connection; 
import java.sql.DriverManager;
  
  
 public class DbCon {
	private static Connection connection = null;
	private static String url = "jdbc:mysql:///jsp_project";
	private static String username = "root";
	private static String password = "";
  
  public static Connection getConnection() throws Exception {
	  if(connection == null) { 
		  Class.forName("com.mysql.jdbc.Driver");
		  connection =  DriverManager.getConnection(url,username,password);
          //System.out.println("connected"); 
      } 
	  return connection;
	  }
  
  }
 
