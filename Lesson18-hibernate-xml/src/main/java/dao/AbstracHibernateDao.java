package dao;

import org.hibernate.Session;

import utils.hibernateUtil;

public class AbstracHibernateDao {
	Session getCurrentSession () {
		return hibernateUtil.getSessionFactory().getCurrentSession();
	}
}
