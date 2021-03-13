package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	private HibernateUtil () {
		
	}
	
	public static SessionFactory getSessionFactory() {
		
		Configuration configuration=new Configuration();
		if(sessionFactory==null) {
			Configuration cfg=new Configuration();
			sessionFactory=cfg.configure("hibernate.cfg.xml").buildSessionFactory();;
		}
		return sessionFactory;
	}
}
