package Bean;

public class Student {
	public Student() {
		
	}
	
	public Student(String name, int age, String classes) {
		
		this.name = name;
		this.age = age;
		this.classes = classes;
	}
	private String name ;
	private int age ;
	private String classes ;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClasses() {
		return this.classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}
	
	
	
	
	
}
