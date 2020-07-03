package exercise;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class Ex01 {
	public static void main(String[] args) {
		Student[] liststudent = { new Student(102, "Nam", "C"), new Student(104, "Hoang", "D"),
				new Student(109, "Lan", "A"), new Student(103, "Bao", "F"), new Student(105, "Nguyen", "B"),
				new Student(107, "Vu", "F"), new Student(103, "Bao", "F"), new Student(202, "Dat", "C"),
				new Student(107, "Vu", "C"), new Student(193, "Bao", "B"), new Student(199, "Tai", "A"), };

		List<Student> listStudents = getStudent(liststudent);
		System.out.println("List student learn fisrt time: ");

		for (Student student : listStudents) {
			System.out.println(student);
		}
		System.out.println("List student learn fisrt time and point A: ");

		for (Student student : listStudents) {
			if (student.getStudentPoint().equals("A"))
				System.out.println(student);
		}
	}

	private static List<Student> getStudent(Student[] students) {
		List listStudents = new ArrayList<Student>();
		for (int i = 0; i < students.length; i++) {
			if (checkExitStudent(students[i], students)) {
				listStudents.add(students[i]);
			}
		}
		return listStudents;
	}

	private static boolean checkExitStudent(Student student, Student[] listStudent) {
		int count = 0;
		for (Student student2 : listStudent) {
			if (student.getStudentId() == student2.getStudentId()) {
				count++;
			}
		}
		return count >= 2 ? false : true;
	}
}
