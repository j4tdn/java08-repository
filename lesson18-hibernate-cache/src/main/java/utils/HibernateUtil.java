package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private HibernateUtil() {

	}

	 //XML configuration
	public static SessionFactory getSessionFactory() {
		//SessionFactory sessionFactory = null;
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}

}
