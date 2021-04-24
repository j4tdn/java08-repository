package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private HibernateUtil() {

	}
	
	// HQL/JPQL: Table: department(id, name)
	// 			 Entity: Department(deptId, deptName)
	// SELECT d FROM Department d WHERE d.deptId = ?
	
	// NativeQuery => Entity, DTO
	
	// CriteriaQuery => only get, fetch data => HQL with object-oriented function

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}
	
}
