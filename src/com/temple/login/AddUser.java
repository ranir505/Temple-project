package com.temple.login;

import java.sql.Connection;
import java.util.Date;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AddUser 
{
	public static int addUser(String user, String pass)
	{
		int status = 0;
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String saveDate = dateFormat.format(date);
		System.out.println(saveDate);
		String sql = "INSERT INTO LOGIN(USERNAME, PASSWORD, CREATED_BY, CREATED_DATE,MODIFIED_DATE ) VALUES('" + user + "', '" + pass + "', '" + user + "', '" + saveDate + "', '" + saveDate + "')";
		try(Connection con = Util.getConnection();
				Statement stmt = con.createStatement())
		{
			status = stmt.executeUpdate(sql);
			System.out.println(status);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return status;
	}
}
