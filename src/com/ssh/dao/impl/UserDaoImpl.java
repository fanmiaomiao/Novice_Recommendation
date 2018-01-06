package com.ssh.dao.impl;


import java.sql.SQLException;






import java.util.List;




import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ssh.dao.UserDao;
import com.ssh.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
/***
 * 保存
 * */
	@Override
	public void add(User user) {
		getHibernateTemplate().save(user);
	}

	
/***
 * 
 *查找 
* */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findUsers() {
		
		List<User> list=(List<User>) getHibernateTemplate().execute(new HibernateCallback() {
			
			/*
			 * 从数据库manager表中进行查找
			 * */
			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query=session.createQuery("from manager");
				return query.list();
			}
		});
		return list;
	}
	
///***
// * 删除
// **/
//	public void del(User user) {
//		getHibernateTemplate().delete(user);
//	}
	
/***
 * 修改
 * */
//	public List<User> updateUserInfo(){
//		
//		
//	}
	 

}