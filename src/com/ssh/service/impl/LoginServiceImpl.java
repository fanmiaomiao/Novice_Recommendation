package com.ssh.service.impl;

import com.ssh.dao.LoginDao;
import com.ssh.dao.impl.LoginDaoImpl;

import com.ssh.service.LoginService;


public class LoginServiceImpl implements LoginService {

	private LoginDao loginDao;
	
	public void setLogindao(LoginDaoImpl loginDao) {
		this.loginDao = loginDao;
	}
	
	//	//需要调取数据库进行，验证成功之后进行登陆
	@Override
	public boolean isLogin(String userName, String password) {
		return loginDao.login(userName, password);
	}
	
	
}
