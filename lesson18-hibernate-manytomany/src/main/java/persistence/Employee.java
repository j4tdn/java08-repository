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

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "duan_nhanvien", joinColumns = {
			@JoinColumn(name = "emp_id", referencedColumnName = "manv") }, inverseJoinColumns = {
					@JoinColumn(name = "pro_id", referencedColumnName = "mada")

	})
	private Set<Project> projects = new HashSet<Project>();

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String email, String firstName, String lastName) {
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

}
