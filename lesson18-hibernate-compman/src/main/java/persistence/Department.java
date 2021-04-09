package persistence;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@Column(name = "dept_Id")
	private Integer deptId;
	
	@Column(name = "dept_name")
	private String deptName;
	
	public Department() {
		
	}
	
	public Department(Integer deptId, String dept_name) {
		super();
		this.deptId = deptId;
		this.deptName = dept_name;
	}

	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id")
	private Set<Employee> employees = new HashSet();

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDept_name() {
		return deptName;
	}

	public void setDept_name(String dept_name) {
		this.deptName = dept_name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public String toString() {
		return deptId + " " + deptName;
	}

}
