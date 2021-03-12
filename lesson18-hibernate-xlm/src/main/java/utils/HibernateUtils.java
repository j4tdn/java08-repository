package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static  SessionFactory sessionFactory;
	private HibernateUtils() {

	}

	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			
		Configuration configuration = new Configuration();
		sessionFactory= configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
//		return configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		return sessionFactory;
	}
}
