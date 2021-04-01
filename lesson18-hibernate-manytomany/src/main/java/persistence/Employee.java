package persistence;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class Employee {
	
	@Id
	@Column(name = "manv")
	private Integer id;
	
	@Column(name = "diachiemail")
	private String email;
	
	@Column(name = "ten")
	private String firstName;
	
	@Column(name = "ho")
	private String lastName;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "taikhoan_nhanvien",
//			joinColumns = {
//			@JoinColumn(name ="maduan", referencedColumnName = "maduan"),
//	},
//	inverseJoinColumns = {
//			@JoinColumn(name = "matk", referencedColumnName = "matk"),
//	}
//			)
//	@JoinColumn(name = "manv")
//	private Set<Project> projects = new HashSet<>();
//	
//	
//	public Employee() {
//	}
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "taikhoan_nhanvien",
			joinColumns = {
			@JoinColumn(name ="emp_id", referencedColumnName = "manv"),
	},
	inverseJoinColumns = {
			@JoinColumn(name = "pro_id", referencedColumnName = "mada"),
	}
			)
	private Set<Project> projects = new HashSet<>();
	
	public Employee() {
	}
	
	
	public Employee(Integer id, String email, String firstName, String lastName) {
		super();
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "id: " + getId() + "name";
	}

	public Set<Project> getProjects() {
		return projects;
	}
	
}
