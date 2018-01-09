package com.ssh.dao.impl;

import com.ssh.dao.LoginDao;



import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
//import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.ssh.entity.User;


public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {

	@Override
	public boolean login(String username, String password) {
		
		@SuppressWarnings("unchecked")
		//查询语句中的 User 不是数据库表名，而是实体类的类名
		List<User> list=(List<User>) getHibernateTemplate().find("from User where username = ? and password = ?",username,password);
		if(list.size() > 0 ) {
			return true;
		} else {
			return false;
		}
				
	}
	
	
	
}
