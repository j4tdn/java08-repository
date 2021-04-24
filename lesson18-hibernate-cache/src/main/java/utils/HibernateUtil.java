package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;

	private HibernateUtil() {

	}
	
	// HQL/ JPQL: Table department(id, name)
			// Entity: Department(deptId, deptName)
	// SELECT d FROM Department d WHERE d.deptId = ?
	
	// Native Query => Entity // DTO
	// CriteriaQuery => HQL with object-oriented function

	/*
	 * XML configuration 
	 */
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		
		return sessionFactory;
		
	}
	
	
}
