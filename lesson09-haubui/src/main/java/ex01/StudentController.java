package ex01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentController {
	public Student[] getStudents(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;

		Set<Student> temp = new HashSet<Student>();
		for (Student student : students) {
			if (!temp.add(student)) {
				temp.removeIf(o -> o.getId().equals(student.getId()));
			} else {
				result[index++] = student;
			}
		}

		return result;
	}

	public Student[] getStudentsByPoint(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;

		Set<Student> temp = new HashSet<Student>();
		for (Student student : students) {
			if (!temp.add(student)) {
				temp.remove(student);
			} else if (student.getPoint().equals("A")) {
				result[index++] = student;
			}
		}

		return result;
	}

}
