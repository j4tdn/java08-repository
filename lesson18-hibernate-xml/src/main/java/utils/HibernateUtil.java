package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	private HibernateUtil() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		//SessionFactory sessionFactory = null;
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			return configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}

}
