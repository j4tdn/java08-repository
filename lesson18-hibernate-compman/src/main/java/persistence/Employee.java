package persistence;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="emp_id")
	private String empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="salary")
	private Double salary;
	
	
	@ManyToOne()
	@JoinColumn(name="dept_id",referencedColumnName = "dept_id")
	private Department department;

	public Employee() {
		
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return department.toString()+empId + " " + empName + " "+ age + " "+ salary;
	}
}
