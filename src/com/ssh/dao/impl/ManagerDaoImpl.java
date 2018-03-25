package com.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.dao.ManagerDao;
import com.ssh.entity.Manager;

public class ManagerDaoImpl extends HibernateDaoSupport implements ManagerDao {

	@SuppressWarnings("all")
	@Override
	public Manager loginManager(Manager manager) {
		List<Manager> list = (List<Manager>) this.getHibernateTemplate().find("from Manager where managerName=? and managerPwd=?", 
				manager.getManagerName(), manager.getManagerPwd());
		if(list.size()>0)
		{
			Manager m = list.get(0);
			return m;
		}
		return null;
	}

}
