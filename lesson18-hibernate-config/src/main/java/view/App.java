package view;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.GradeInfo;
import persistence.Student;

public class App {
	private static StudentDao studentDao;
	
	static {
		studentDao = new HibernateStudentDao();
	}
	public static void main(String[] args) {
		
		studentDao.delete(new Student(2, "Dau", "Thuy", "thuy@gmail.com"));
		List<Student> students = studentDao.getAll();
		
		System.out.println("size: " + students.size());
		
//		List<Student> students = studentDao.getAll();
//		System.out.println("size: " + students.size());
		
//		List<GradeInfo> result = studentDao.getGradeInfos();
//		System.out.println("size: " + result.size());
		
	}
}		
		
