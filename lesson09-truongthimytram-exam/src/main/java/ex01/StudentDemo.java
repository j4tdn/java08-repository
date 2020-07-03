package ex01;

import utils.StudentUtils;

public class StudentDemo {

	public static void main(String[] args) {
		Student st1 = new Student(102, "Nam", "C");
		Student st2 = new Student(103, "Lan", "A");
		Student st3 = new Student(104, "Hòa", "B");
		Student st4 = new Student(102, "Nam", "F");
		Student st5 = new Student(105, "Khải", "D");
		Student st6 = new Student(105, "Hiền", "A");
		Student st7 = new Student(106, "Hồng", "C");
		Student st8 = new Student(107, "Hải", "D");
		
		Student[] students = { st1, st2, st3, st4, st5, st6, st7, st8 };
		
		StudentUtils.getStudentsOnceA(students);
		System.out.println(students);
		StudentUtils.getStudentsOnceA(students);
		

	}

}
