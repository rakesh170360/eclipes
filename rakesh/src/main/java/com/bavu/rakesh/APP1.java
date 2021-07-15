package com.bavu.rakesh;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;

public class APP1 {

	public static void main(String[] args) {
		
	try{
		//Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");  
		
		//get the connection
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rakesh","root","Welcome1"); 
	
	//create the statement object
	Statement stmt=con.createStatement(); 
	
	//execute the queries
	stmt.executeUpdate("insert into students values(1003,'mahesh',8790121133,'cmr')");
	
	//ResultSet rs=stmt.executeQuery("SELECT * FROM `students`");  
	//while(rs.next())  
	//System.out.println(rs.getString(1)+","+rs.getString(2));  
	System.out.println("coool buddy...");
	con.close();  
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
   
}

}
