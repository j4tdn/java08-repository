package view;

import org.hibernate.Session;

import com.mysql.cj.xdevapi.SessionFactory;

import util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
				System.out.println("sessionL" + session);
	}
}
