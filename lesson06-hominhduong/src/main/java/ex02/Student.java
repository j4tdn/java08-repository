package ex02;

public class Student {
	private String id;
	private String name;
	private String password;
	private String dayOfBirth;

	public Student(String id, String name, String password, String dayOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.dayOfBirth = dayOfBirth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

}
