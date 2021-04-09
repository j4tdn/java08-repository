package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empoyee")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private String empId;
	
	@Column(name = "emp_name")
	private String empName;
	
	@Column(name = "age")
	private Integer empAge;
	
	@Column(name = "salary")
	private Double empSalary;
	

//	@Column(name = "department")
//	@JoinColumn(name = "dept_Id")
//	private Department department;
	
//	@ManyToOne()
//	@JoinColumn(name = "dept_id")
//	private Department department;
	
	public Employee(){
		
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

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public Double getEmpAalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empAalary) {
		this.empSalary = empAalary;
	}

	@Override
	public String toString() {
		return empId + " " + empName + " " + empAge + " " + empSalary;
	}

	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn (name = "department");


	
	
	
}
