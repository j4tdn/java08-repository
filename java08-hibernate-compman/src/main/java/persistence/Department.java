package persistence;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@Column(name = "dept_id")
	private String dept_id;
	
	@Column(name = "dept_name")
	private String dept_name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	private Set<Employee> employees = new HashSet<Employee>();
	private Set<Project> project;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param dept_id
	 * @param dept_name
	 */
	public Department(String dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}



	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", employees=" + employees + "]";
	}
	
	

}
