package dao;

import org.hibernate.Session;

import utils.HibernateUtil;

public class AbstractHibernateDao {
	Session getCurreSession() {
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}

}
