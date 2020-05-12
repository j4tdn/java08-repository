package java08.lesson03_ungmydieu_test;

public class Student {
	private String name;
	private int age;
	private String className;
	
	public Student() {}	
	
	public Student(String name, int age, String className) {
		super();
		this.name = name;
		this.age = age;
		this.className = className;
	}

	@Override
	public String toString() { 
		return "\n\tStudent: " + this.getName() + ", " + this.getAge() + ", " + this.getClassName();
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
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}	
	
	
}
