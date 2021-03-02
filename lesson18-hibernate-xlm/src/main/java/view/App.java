package view;

import org.hibernate.Session;

import utils.HibernateUtils;

public class App {
	public static void main(String[] args) {
		Session session=HibernateUtils.getSessionFactory().openSession();
		System.out.println("Session: "+session);
	}
}
