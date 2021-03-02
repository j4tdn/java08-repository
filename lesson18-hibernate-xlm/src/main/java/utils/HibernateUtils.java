package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private HibernateUtils() {

	}

	public static SessionFactory getSessionFactory() {
		SessionFactory sessionfactory = null;
		Configuration configuration = new Configuration();
		return configuration.configure("hibernate.cfg.xml").buildSessionFactory();
	}
}
