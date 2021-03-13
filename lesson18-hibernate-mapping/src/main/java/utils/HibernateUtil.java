package utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;



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