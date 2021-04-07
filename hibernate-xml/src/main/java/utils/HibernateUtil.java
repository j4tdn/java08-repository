package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				sessionFactory = configuration.configure("hibernate.cfg.xml")
						.buildSessionFactory();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}