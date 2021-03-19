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
		//studentDao.save(new Student(4, "tram", "truong", "tramtruongrcm@gmail.com"));
		
		studentDao.delete(new Student(2, "Lai", "Le", "lelai@gmail.com"));
		List<Student> students = studentDao.getAll();
		List<GradeInfo> result = studentDao.getGradeInfos();
		System.out.println("gradeInfo " + result);

	}

}