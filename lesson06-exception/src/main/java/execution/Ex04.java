package execution;

public class Ex04 {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		students[2] = new Student();
		students[2].fullName = "LeNa";
//		student.fullName = "LaNa";
//		System.out.println("Name: " + student.fullName);
	}
}

class Student{
	String fullName;
}