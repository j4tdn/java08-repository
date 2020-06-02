package execution;

public class Ex04 {
	public static void main(String[] args) {
		Student[] student = new Student[5];
		student[2] = new Student();
		student[2].fullname = "LeNa";
		System.out.println("name : " + student[2].fullname);
	}
}

class Student {
	String fullname;
}
