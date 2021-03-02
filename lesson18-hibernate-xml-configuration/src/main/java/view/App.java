package view;

import org.hibernate.Session;

import utils.HibernateUtil;

public class App {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		System.out.println("session: " + session);
	}
}
