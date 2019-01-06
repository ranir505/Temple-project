package com.temple.service;

import java.util.List;

import com.temple.dao.UserInfoDao;
import com.temple.model.UserInfo;

public class UserInfoService 
{
	public UserInfoDao userInfoDao;
	
	public  List<UserInfo> getUserInfo()
	{
		List<UserInfo> list=userInfoDao.getUserInfo();
		return list;
	}
	
}
