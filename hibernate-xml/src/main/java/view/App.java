package view;

import java.util.List;

import dao.StudentDao;
import persistence.Student;

public class App {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		Student student = new Student("Nam", "Teo", "nam.teo@gmail.com");
		studentDao.saveStudent(student);

		List<Student> students = studentDao.getStudents();
		students.forEach(s -> System.out.println(s.getFirstName()));
	}
}
