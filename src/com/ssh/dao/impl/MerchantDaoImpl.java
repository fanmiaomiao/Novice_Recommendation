package com.ssh.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.dao.MerchantDao;
import com.ssh.entity.Merchant;

public class MerchantDaoImpl extends HibernateDaoSupport implements MerchantDao {

	//����̼�
	public void add(Merchant merchant) {
		this.getHibernateTemplate().save(merchant);
	}

}
