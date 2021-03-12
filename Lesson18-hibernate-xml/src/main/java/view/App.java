package view;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.Student;

public class App {
	
	private static StudentDao studentDao;
	
	static {
		studentDao = new HibernateStudentDao();
	}
	
	public static void main(String[] args) {
		studentDao.save(new Student(3, "Thang", "Ngoc", "namngoc@gmail.com"));
		List<Student> students = studentDao.getAll();
		
		for (Student student : students) {
			System.out.println(student.getFirstName());
		}
	}
}
