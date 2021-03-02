package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateUtil {

	private hibernateUtil() {

	}

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		return configuration.configure("hibernate.cgf.xml").buildSessionFactory();
	}
}
