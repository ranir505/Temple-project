package com.temple.login;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util 
{
	public static Connection getConnection() throws SQLException
	{	Properties props=new Properties();
		try
		{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
			File path= new File("c:\\users\\rashmi\\desktop\\db.properties");
			FileInputStream stream= new FileInputStream(path);
		
			props.load(stream);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
	//	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "lara");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", props);
		return con;
	}
}
