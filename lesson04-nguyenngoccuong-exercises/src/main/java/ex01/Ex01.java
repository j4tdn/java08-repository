package ex01;

import java.util.Scanner;

public class Ex01 {

	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Student sv1 = new Student(102160083, "Cuong", 8.5f, 9.2f);
		Student sv2 = new Student(102160084, "Closest Friend", 7.9f, 9.8f);
		Student sv3 = new Student();
		inputStudent(sv3);
		printStudentsList(sv1, sv2, sv3);
	}

	public static void inputStudent(Student student) {
		do {
			try {
				System.out.print("ID: ");
				student.setId(Integer.parseInt(input.nextLine()));
				if (student.getId() <= 0)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("ID must be a positive integer!");
			}
		} while (student.getId() <= 0);

		System.out.print("Full Name: ");
		do {
			student.setName(input.nextLine());
		} while (student.getName().trim().length() == 0);

		do {
			try {
				student.setTheoryScore(-1);
				System.out.print("Theory Score: ");
				student.setTheoryScore(Float.parseFloat((input.nextLine())));
				if (student.getTheoryScore() < 0 || student.getTheoryScore() > 10)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Theory Score must be between 0 and 10!");
			}
		} while (student.getTheoryScore() < 0 || student.getTheoryScore() > 10);

		do {
			try {
				student.setPracticeScore(-1);
				System.out.print("Practice Score: ");
				student.setPracticeScore(Float.parseFloat((input.nextLine())));
				if (student.getPracticeScore() < 0 || student.getPracticeScore() > 10)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Practice Score must be between 0 and 10!");
			}
		} while (student.getPracticeScore() < 0 || student.getPracticeScore() > 10);
	}

	public static void printStudentsList(Student... students) {
		System.out.format("%-25s%-20s%15s%20s%20s", "MSSV", "Họ tên", "Điểm lý thuyết", "Điểm thực hành",
				"Điểm trung bình");
		System.out.println();
		for (int i = 0; i < 100; i++) {
			System.out.print("=");
		}
		System.out.println();
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
