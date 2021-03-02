package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private HibernateUtil() {

	}

	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = null;
		Configuration configuration = new Configuration();
		return configuration.configure("hibernate.cfg.xml").buildSessionFactory();
	}
}