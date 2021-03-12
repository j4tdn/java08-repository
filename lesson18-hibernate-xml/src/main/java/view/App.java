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
		List<Student> a = studentDao.getAll();
		a.forEach(x -> System.out.println(x));
	}

}
