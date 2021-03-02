package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private HibernateUtil() {

	}

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		return configuration.configure("hibernate.cfg.xml").buildSessionFactory();
	}
}
