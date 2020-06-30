package ex02;

public class Demo {
	public static void main(String[] args) {
		StudentUtils demo = new StudentUtils();
		// System.out.println(demo.inputIdStudent());
		String name = demo.inputNameStudent();
		String id = demo.inputIdStudent();
		String dayOfBirth = demo.inputDateOfBirth();
		String password = demo.inputPassword();
		Student student = new Student(id, name, password, dayOfBirth);
	}

}
