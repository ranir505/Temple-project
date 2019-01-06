package com.temple.model;

public class UserInfo
{
	private int id;
	
	private String firstname;
	
	private String lastname;
	
	private String userid;
	
	private String pwd;
	
	private int usertype;
	
	public UserInfo()
	{
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getUsertype() {
		return usertype;
	}

	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", userid=" + userid
				+ ", pwd=" + pwd + ", usertype=" + usertype + "]";
	}
}
