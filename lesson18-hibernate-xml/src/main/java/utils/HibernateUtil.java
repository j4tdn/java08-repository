package utils;

import java.nio.channels.SeekableByteChannel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	private HibernateUtil() {
		
	}
	
	//org.hibernate.Session
	public static SessionFactory getSessionFactory() {
//		SessionFactory sessionFactory = null;
//		Configuration configuration = new Configuration();
		
		if(sessionFactory == null) {
			Configuration cfg = new Configuration();
			sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		
		return sessionFactory;
		//return configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		//doc tham so trong file hibernate.cfg.xml -> return ve 1 obj trong <session-factory> voi cac thuoc tinh name
	}
}
