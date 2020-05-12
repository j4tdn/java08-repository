package java08.lesson03_nguyenphuoctam_test;

public class Student {
	private String idStudent;
	private String name;
	private int age;
	private String clazz;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String idStudent, String name, int age, String clazz) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.age = age;
		this.clazz = clazz;
	}

	public String getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
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

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", name=" + name + ", age=" + age + ", clazz=" + clazz + "]";
	}
	
}
