package util;

import java.util.Scanner;

import bean.Student;

public class Ex01Util {
	public static void importSV(Student... students) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Mã sv: ");
			int id = Integer.parseInt(sc.nextLine());

			System.out.println("Tên sinh viên: ");
			String Name = sc.nextLine();

			System.out.println("Điểm LT: ");
			float LT = Float.parseFloat(sc.nextLine());

			System.out.println("Điểm TH: ");
			float TH = Float.parseFloat(sc.nextLine());

			students[i] = new Student(id, Name, TH, LT);
		}
	}

	public static void export(Student...students) {
		if (students.length == 0) {
			System.out.println("No information exits!!!");
		}
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
