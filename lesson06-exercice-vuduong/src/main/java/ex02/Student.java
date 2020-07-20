package ex02;

import java.time.LocalDate;

public class Student {
	private String id;
	private String name;
	private String password;
	private LocalDate dateOfBirth;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, String password, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
}
