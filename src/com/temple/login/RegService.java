package com.temple.login;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class RegService 
{
	public static int registerUser(String user, String pass)
	{
		int status = 0;
		String sql = "INSERT INTO LOGIN(USERNAME, PASSWORD, CREATED_BY) VALUES('" + user + "', '" + pass + "', '" + user + "')";
		try(Connection con = Util.getConnection();
				Statement stmt = con.createStatement())
		{
			status = stmt.executeUpdate(sql);
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return status;
	}
}
