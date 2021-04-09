package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import utils.HibernateUtils;

public class AbstractHibernateDao {

	Session getCurrentSession() {
		return HibernateUtils.getSessionFactory().getCurrentSession();
	}
	
	
	@SuppressWarnings("unchecked")
	<T> List<T> safeList(Query<?> query) {
		return (List<T>) query.getResultList();
	}
}