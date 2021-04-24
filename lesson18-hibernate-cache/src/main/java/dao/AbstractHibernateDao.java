package dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;

public class AbstractHibernateDao {

	Session getCurrentSession() {
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}

	Session openSession() {
		return HibernateUtil.getSessionFactory().openSession();
	}
	
	@SuppressWarnings("unchecked")
	<T> List<T> safeList(Query<?> query){
		return (List<T>)query.getResultList();
	}
}
