package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {

	}

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		if (sessionFactory == null) {
			sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}
}
