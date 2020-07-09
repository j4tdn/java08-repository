package execution;

public class Ex04 {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		students[2] = new Student();
		students[2].fullname = "LeNa";
		System.out.println("Name: " + students[2].fullname);
	}
}

class Student {
	String fullname;
}
