package com.ssh.service;

import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface LoginService {
	boolean isLogin(String userName,String password);
}
