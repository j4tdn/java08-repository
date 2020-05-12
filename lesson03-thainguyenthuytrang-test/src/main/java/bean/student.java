package bean;

public class student {
      private String name;
      private int age;
      private String lop;
      
      public student() {
	}
      
	public String getName() {
		return name;
	}
	public student(String name, int age, String lop) {
		super();
		this.name = name;
		this.age = age;
		this.lop = lop;
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
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
      
      
}
