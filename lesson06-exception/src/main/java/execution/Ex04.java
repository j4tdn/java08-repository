package execution;

public class Ex04 {

	public static void main(String[] args) {
		Student student = null;

		student.fullName = "Le Na";
		System.out.println("Name: " + student.fullName);

		Student[] student1 = new Student[5];
		student1[2] = new Student();

		student.fullName = "Le Na";
		System.out.println("Name: " + student.fullName);
	}

}

class Student {
	String fullName;

}