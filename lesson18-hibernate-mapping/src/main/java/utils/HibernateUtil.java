package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {

	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}

//	public static SessionFactory getSessionFactory() {
//		if (sessionFactory == null) {
//			Configuration configuration = new Configuration();
//
//			// Hibernate settings equivalent to hibernate.cfg.xml's properties
//			Properties settings = new Properties();
//			settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/java08_hibernate?useSSL=false");
//			settings.put(Environment.USER, "root");
//			settings.put(Environment.PASS, "1234");
//			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
//
//			settings.put(Environment.SHOW_SQL, "true");
//
//			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
//
//			// settings.put(Environment.HBM2DDL_AUTO, "create-drop");
//
//			configuration.setProperties(settings);
//
//			configuration.addAnnotatedClass(Student.class);
//
//			sessionFactory = configuration.buildSessionFactory();
//		}
//		return sessionFactory;
//	}

}
