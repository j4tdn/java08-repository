package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateUtil {
	private static SessionFactory sessionFactory;

	private hibernateUtil() {

	}

	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cgf.xml").buildSessionFactory();
		}
		return sessionFactory;
	}
}
