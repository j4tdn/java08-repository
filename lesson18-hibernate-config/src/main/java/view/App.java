package view;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.Student;

public class App {
	
	private static StudentDao studentDao;
	
	static {
		studentDao=new HibernateStudentDao();
	}
	
	public static void main(String[] args) {
//		Session session1 = HibernateUtil.getSessionFactory().openSession();
//		Session session2 = HibernateUtil.getSessionFactory().getCurrentSession();
//		
//	//	session2.save(new Student(2,"Nam","Hoang","hoangnam@gmail.com"));
//		//insert into sinh vien
//		Transaction transaction=session2.beginTransaction();
//		try {
//			session2.save(new Student(2,"Nam","Hoang","hoangnam@gmail.com"));
//		} catch (Exception e) {
//			transaction.rollback();
//		}
//				
//		transaction.commit();
//		
//		System.out.println("Session1: "+session1);
//		System.out.println("Session2: "+session2);
//		
	//studentDao.save(new Student(2, "Chau", "Ngoc", "ngocchau@gmail.com"));
		List<Student> students=studentDao.getAll();
		System.out.println("size: "+students.size());
		
		
		
	}
}