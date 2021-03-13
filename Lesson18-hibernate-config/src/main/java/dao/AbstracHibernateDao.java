package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import utils.hibernateUtil;

public class AbstracHibernateDao {
	Session getCurrentSession () {
		return hibernateUtil.getSessionFactory().getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	<T> List<T> safeList(Query<?> query) {
		return (List<T>) query.getResultList();
	}
}
