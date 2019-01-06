package com.temple.controller;

import java.util.List;

import com.temple.model.UserInfo;
import com.temple.service.UserInfoService;

public class UserInfoController{
	
	public UserInfoService userInfoService;
	
	public List<UserInfo> getUserInfo(){
		List<UserInfo> list=userInfoService.getUserInfo();
		return list;
	}
	
}
