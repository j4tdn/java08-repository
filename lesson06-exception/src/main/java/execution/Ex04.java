package execution;

public class Ex04 {
	public static void main(String[] args) {
//		Student student = new Student();
//		student.fullname = "LeNa";
//		System.out.println("Name: " + student.fullname);
		
		Student[] students = new Student[5];
		try {
		//	students[2] = new Student();
			students[2].fullname = "LeNa";
			System.out.println("Name: " + students[2].fullname);
		} catch (NullPointerException e) {
			System.out.println("Error: " + e);
		}

	}
}

class Student {
	String fullname;
}