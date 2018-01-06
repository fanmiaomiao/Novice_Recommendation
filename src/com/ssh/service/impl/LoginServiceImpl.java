package com.ssh.service.impl;

import com.ssh.service.LoginService;

public class LoginServiceImpl implements LoginService {

	//需要调取数据库进行，验证成功之后进行登陆
	@Override
	public boolean isLogin(String userName, String password) {
		if ("1".equals(userName) && "1".equals(password)) {
			return true;
		} else {
			return false;
		}
	}

}
