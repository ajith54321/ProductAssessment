package com.lulu.dbAssesment;

import java.sql.Connection;

import java.sql.DriverManager;

public class ConnectDB  {

	static Connection connection;
	static Connection setupConnection() {

	try {

		 Class.forName("com.mysql.cj.jdbc.Driver");//drive support sets up
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajith", "root", "Palaninathan1105");
	}
	catch(Exception E) {}
     return connection; 
  }

}