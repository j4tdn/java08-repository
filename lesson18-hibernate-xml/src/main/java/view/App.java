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
			// studentDao.save(new Student(1,"trung","bui","buitrung@gmail.com"));
			
			studentDao.delete(new Student(1,"trung","bui","buitrung@gmail.com"));
			
			List<Student> students = studentDao.getAll();
			
			System.out.println(students);
			
			System.out.println("\n-------------------------------------\n");
			
			List<GradeInfo> gradeInfos = studentDao.getGradeInfos();
			
			System.out.println(gradeInfos);
			
	}
}
