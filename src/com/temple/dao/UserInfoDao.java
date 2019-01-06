package com.temple.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.temple.login.Util;
import com.temple.model.UserInfo;

public class UserInfoDao {
	 List<UserInfo> list = null;

	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	public List<UserInfo> getUserInfo() {
		list = new ArrayList<>();
		try {
			con = Util.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from tbluserinfo");

			while (rs.next()) {
				UserInfo u2 = new UserInfo();
				u2.setId(rs.getInt("id"));
				// rs.getInt("id");

				u2.setFirstname(rs.getString("firstname"));
				u2.setLastname(rs.getString("lastname"));
				u2.setUserid(rs.getString("userid"));
				u2.setPwd(rs.getString("pwd"));
				u2.setUsertype(rs.getInt("usertype"));

				/*
				 * rs.getString("lastname"); rs.getString("userid");
				 * rs.getString("pwd"); rs.getInt("usertype");
				 */

				list.add(u2);

				// list.add((List<UserInfo>)rs);
			}
			System.out.println(" userinfo " + rs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
}
