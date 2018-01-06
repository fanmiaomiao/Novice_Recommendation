package com.ssh.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.entity.User;

@Transactional
public interface UserService {
	
	
	/**
	 * 添加用户
	 * */
	public void add(User user);
	/***
	 * 返回用户列表
	 * */
	public List<User> findUsers();
	
//	/**
//	 * 删除用户
//	 * */
//	public void del(User user);
//	
//	/**
//	 *修改用户信息 
//	 **/
//	public List<User> updateUserInfo();
//	 

}

