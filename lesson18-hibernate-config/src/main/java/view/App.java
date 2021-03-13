package view;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.Student;

public class App {

	private static StudentDao studentDao;

	static {
		studentDao = new HibernateStudentDao();
	}

	public static void main(String[] args) {
		
		studentDao.delete(new Student(2, "Hoang", "Nam", "hoangnam@gmail.com"));
		var result = studentDao.getAll();
		
		result.forEach(x -> System.out.println(x));
	}

}
