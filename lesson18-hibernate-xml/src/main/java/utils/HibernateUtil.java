package utils;

import java.nio.channels.SeekableByteChannel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private HibernateUtil() {
		
	}
	
	//org.hibernate.Session
	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = null;
		Configuration configuration = new Configuration();
		return configuration.configure("hibernate.cfg.xml").buildSessionFactory();
	}
}
