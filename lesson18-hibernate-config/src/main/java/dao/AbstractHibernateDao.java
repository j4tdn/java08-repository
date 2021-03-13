package dao;

import org.hibernate.Session;

import utils.HibernateUtil;

public class AbstractHibernateDao {

	Session getCurrentSession() {
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}
}
