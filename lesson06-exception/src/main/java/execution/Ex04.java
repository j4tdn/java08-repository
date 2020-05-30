package execution;

public class Ex04 {
	public static void main(String[] args) {
		Student[] student = new Student[5];
		
		student[2] = new Student();
		
		student[2].fullName = "LeNa";
		System.out.println("Name: " + student[2].fullName);
	}
}

class Student {
	String fullName;
}