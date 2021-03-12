package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "sinhvien")
@NamedQueries({ @NamedQuery(name = "Student.GET_ALL", query = "SELECT st FROM Student st") })
public class Student {
	public static final String GET_ALL = "Student.GET_ALL";
	
	// JPA default contructor
	public Student() {
	}

	@Id
	@Column(name = "masv")
	private Integer id;

	@Column(name = "ten")
	private String firstName;

	@Column(name = "ho")
	private String LastName;

	@Column(name = "email")
	private String email;

	public Student(Integer id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
