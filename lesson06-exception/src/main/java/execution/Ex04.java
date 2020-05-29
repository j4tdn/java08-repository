package execution;

public class Ex04 {
	public static void main(String[] args) {
		Student student = new Student();
		student.fullname = "john";
		System.out.println(student.fullname);
	}
}

class Student {
	String fullname;
}
