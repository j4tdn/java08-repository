package util;

import java.util.Properties;


import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {

	}


	// org.hibernate.Session
	// java - configuration
	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}
	
	/*
	 * //java - configuration public static SessionFactory getSessionFactory() {
	 * 
	 * if(sessionFactory == null) { Configuration cfg = new Configuration();
	 * 
	 * Properties props = new Properties(); props.put(Environment.DRIVER,
	 * "com.mysql.cj.jdbc.Driver"); props.put(Environment.URL,
	 * "jdbc:mysql://localhost:3306/java08_hibernate?useSSL=false");
	 * props.put(Environment.USER, "root"); props.put(Environment.PASS, "111111");
	 * props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
	 * 
	 * props.put(Environment.SHOW_SQL, "true");
	 * 
	 * props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
	 * 
	 * // settings.put(Environment.HBM2DDL_AUTO, "create-drop");
	 * cfg.setProperties(props); cfg.addAnnotatedClass(Student.class);
	 * sessionFactory = cfg.buildSessionFactory(); } return sessionFactory; }
	 */

}