package com.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.ManagerDao;
import com.ssh.entity.Manager;


@Transactional
public class ManagerService {
	private ManagerDao managerDao;

	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}

	public Manager login(Manager manager) {
		// TODO Auto-generated method stub
		return managerDao.loginManager(manager);
	}

	
}

