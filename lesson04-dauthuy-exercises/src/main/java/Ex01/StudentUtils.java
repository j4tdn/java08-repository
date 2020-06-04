package Ex01;

import java.util.Scanner;

public class StudentUtils {
	
	public static void input(Student student) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("MSSV: ");
		int mssv = Integer.parseInt(sc.nextLine());
		student.setMSSV(mssv);;
		
		System.out.print("Họ và tên: ");
		String fullName = sc.nextLine();
		student.setFullName(fullName);
		
		System.out.print("Điểm LT: ");
		float theoryPoint = Float.parseFloat(sc.nextLine());
		student.setTheoryPoint(theoryPoint);
		
		System.out.print("Điểm BT: ");
		float practicePoint = Float.parseFloat(sc.nextLine());		
		student.setPracticePoint(practicePoint);
	}
	
	public static void ListStudent(Student...students) {
		for (Student student: students) {
			System.out.println(student);
		}
	}
}
