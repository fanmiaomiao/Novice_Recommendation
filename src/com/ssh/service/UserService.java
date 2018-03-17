package com.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.UserDao;


@Transactional
public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	

}

