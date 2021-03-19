package persistence;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "sinhvien")
@NamedQueries({
	@NamedQuery(name = "Student.GET_ALL", 
			    query = "SELECT st FROM Student st") //HQL
})
public class Student {

	public static final String GET_ALL =  "Student.GET_ALL";
	// sequence:
	@Id
	@Column(name = "masv")
	private Integer Id;

	@Column(name = "ten")
	private String firstname;

	@Column(name = "ho")
	private String lastname;

	@Column(name = "email")
	private String email;
	
	// JPA default constructor
	public Student() {
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Student(Integer id, String firstName, String lastName, String email) {
		super();
		this.Id = id;
		this.firstname = firstName;
		this.lastname = lastName;
		this.email = email;
	}

	
}
