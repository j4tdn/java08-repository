package dao;

import org.hibernate.Session;

import utils.HibernateUtils;

public class AbstractHibernateDao {
Session getCurrentSession() {
	return HibernateUtils.getSessionFactory().getCurrentSession();
}
}
