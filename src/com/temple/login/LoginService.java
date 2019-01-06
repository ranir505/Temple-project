package com.temple.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginService 
{
	public static boolean authenticateUser(String user, String pass)
	{
		boolean status = false;
		String sql = "SELECT * FROM LOGIN WHERE USERNAME='" + user + "' AND PASSWORD='" + pass + "'";
		try(Connection con = Util.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql))
		{
			status = rs.next();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return status;
	}
}
