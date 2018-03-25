package com.ssh.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.APDao;
import com.ssh.entity.AP;


@Transactional
public class APService {
	private APDao apDao;

	public void setApDao(APDao apDao) {
		this.apDao = apDao;
	}



	public AP search(AP ap) {
		// TODO Auto-generated method stub
		return apDao.search(ap);
	}



	public List<AP> searchAll() {
		// TODO Auto-generated method stub
		return apDao.searchAll();
	}



	public void add(AP ap) {
		// TODO Auto-generated method stub
		apDao.add(ap);
	}

	
}

