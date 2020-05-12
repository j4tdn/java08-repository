package bean;

public class Student {
	private String name;
	private int age;
	private String classStudent;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String classStudent) {
		super();
		this.name = name;
		this.age = age;
		this.classStudent = classStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassStudent() {
		return classStudent;
	}

	public void setClassStudent(String classStudent) {
		this.classStudent = classStudent;
	}

	@Override
	public String toString() {
		return "Sinh viên: " + name + ", " + age + ", " + classStudent;
	}

}
