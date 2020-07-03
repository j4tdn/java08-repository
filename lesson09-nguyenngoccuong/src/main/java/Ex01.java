import java.util.ArrayList;

import bean.Student;

public class Ex01 {

	public static void main(String[] args) {
		Student[] students = Student.initData();

		Student[] studentOnce = getOnce(students);
		for (Student student : studentOnce) {
			System.out.println(student);
		}
		System.out.println("=============================================");
		Student[] studentRankA = getRankA(students);
		for (Student student : studentRankA) {
			System.out.println(student);
		}

	}

	public static Student[] getOnce(Student[] students) {
		boolean duplicate = false;
		ArrayList<Student> studentList = new ArrayList<Student>();
		for (int i = 0; i < students.length; i++) {
			duplicate = false;
			for (int j = 0; j < students.length; j++) {
				if (students[i].getId() == students[j].getId() && i != j) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				studentList.add(students[i]);
			}
		}
		return studentList.toArray(new Student[studentList.size()]);
	}

	public static Student[] getRankA(Student[] students) {
		boolean duplicate = false;
		ArrayList<Student> studentList = new ArrayList<Student>();
		for (int i = 0; i < students.length; i++) {
			if (students[i].getRank() == 'A') {
				for (int j = 0; j < students.length; j++) {
					if (students[i].getId() == students[j].getId() && i != j) {
						duplicate = true;
						break;
					}
				}
				if (!duplicate) {
					studentList.add(students[i]);
				}
			}
		}
		return studentList.toArray(new Student[studentList.size()]);
	}

}
