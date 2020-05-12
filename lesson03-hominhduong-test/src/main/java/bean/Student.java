package bean;

public class Student {
	private String name;
	private int age;
	private String classes;
	
	public Student(String name, int age, String classes) {
		super();
		this.name = name;
		this.age = age;
		this.classes = classes;
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

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", classes=" + classes + "]";
	}
	
	
	
}
