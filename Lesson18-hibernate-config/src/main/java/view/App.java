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
		studentDao.detele(new Student(3, "Thang", "Ngoc", "namngoc@gmail.com"));
		List<Student> students = studentDao.getAll();
		
//		List<GradeInfo> gradeInfos = studentDao.getGradeInfos();
		System.out.println(students.size());
		
		
	}
}
