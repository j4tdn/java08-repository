package dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;

import util.HibernateUtil;

public class AbstractHibernateDao {
	Session getCurreSession() {
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
	Session openSession() {
		return HibernateUtil.getSessionFactory().openSession();
	}

	@SuppressWarnings("unchecked")
	<T> List<T> safeList(Query<?> query) {
		return (List<T>) query.getResultList();
	}
}