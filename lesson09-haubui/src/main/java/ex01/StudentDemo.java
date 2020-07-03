package ex01;

import java.util.Arrays;

public class StudentDemo {
	public static void main(String[] args) {
		StudentController controller = new StudentController();
		Student[] students = 
		{
		new Student("102", "Nam", "C"),
		new Student("104", "Hoàng", "D"),
		new Student("109", "Lan", "A"),
		new Student("103", "Bảo", "F"),
		new Student("105", "Nguyên", "B"),
		new Student("107", "Vũ", "F"),
		new Student("103", "Bảo", "F"),
		new Student("202", "Đạt", "C"),
		new Student("107", "Vũ", "C"),
		new Student("193", "Bảo", "B"),
		new Student("199", "Tài", "A"),
		};
		System.out.println(Arrays.toString(controller.getStudents(students)));
		System.out.println(Arrays.toString(controller.getStudentsByPoint(students)));
	}
}
