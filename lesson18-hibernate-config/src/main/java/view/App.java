package view;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.GradeInfo;
import persistence.Student;
import util.HibernateUtil;

public class App {
	private static StudentDao studentDao;
	static {
		studentDao = new HibernateStudentDao();
	}
	public static void main(String[] args) {
		 studentDao.delete(new Student(2,"Chau","Ngoc","ngocchau@gmail.com"));
		 List<Student> students = studentDao.getAll();
		// List<GradeInfo> result = studentDao.getGradeInfo();
		 System.out.println("student size: "+students.size());

	}
}