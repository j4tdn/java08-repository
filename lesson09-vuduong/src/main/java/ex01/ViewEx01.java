package ex01;

import java.util.Arrays;

public class ViewEx01 {
	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", "C"), new Student(104, "Hoàng", "D"),
				new Student(109, "Lan", "A"), new Student(103, "Bảo", "F"), new Student(105, "Nguyên", "B"),
				new Student(107, "Vũ", "F"), new Student(103, "Bảo", "F"), new Student(202, "Đạt", "C"),
				new Student(107, "Vũ", "C"), new Student(193, "Bảo", "B"), new Student(199, "Tài", "A"), };
		
		Arrays.asList(getStudentsRegisterOnce(students)).forEach(System.out::println);
		System.out.println("==================================");
		Arrays.asList(getStudentsRegisterOnceAndGetPointA(students)).forEach(System.out::println);

	}

	private static Student[] getStudentsRegisterOnce(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		
		for (Student student : students) {
			boolean isExist = false;

			for (int i = 0; i < result.length; i++) {
				if (result[i] != null && result[i].equals(student)) {
					isExist = true;
					break;
				}
			}

			if (!isExist) {
				result[index++] = student;
			}
		}
		
		return Arrays.copyOfRange(result, 0, index);
	}
	
	private static Student[] getStudentsRegisterOnceAndGetPointA(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		
		for (Student student : students) {
			boolean isExist = false;

			for (int i = 0; i < result.length; i++) {
				if (result[i] != null && result[i].equals(student)) {
					isExist = true;
					break;
				}
			}

			if (!isExist && student.getPoint().equals("A")) {
				result[index++] = student;
			}
		}
		
		return Arrays.copyOfRange(result, 0, index);
	}
}
