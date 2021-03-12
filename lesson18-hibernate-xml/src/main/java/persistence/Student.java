package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "sinhvien")
@NamedQueries({
	@NamedQuery(name = "Student.GET_ALL", query = "SELECT st FROM Student st")
})
public class Student {
	public static final String GET_ALL = "Student.GET_ALL";

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "masv")
	private Integer id;
	
	@Column(name = "ten") 
	private String firstName;
	
	@Column(name = "ho")
	private String lastName;
	
	@Column(name = "email")
	private String email;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	

}
