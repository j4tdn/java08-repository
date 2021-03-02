package view;

import org.hibernate.Session;

import utils.hibernateUtil;

public class App {
	public static void main(String[] args) {
		Session session =hibernateUtil.getSessionFactory().openSession();
		
		System.out.println("session" + session);
	}
}
