package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.dao.APDao;
import com.ssh.entity.AP;

public class APDaoImpl extends HibernateDaoSupport implements APDao {

	@Override
	public AP search(AP ap) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(AP.class);
		criteria.add(Restrictions.eq("apName", ap.getApName()));
		return (AP) this.getHibernateTemplate().findByCriteria(criteria).get(0);
	}

	@Override
	public List<AP> searchAll() {
		// TODO Auto-generated method stub
		return (List<AP>) this.getHibernateTemplate().find("from AP");
	}

}
