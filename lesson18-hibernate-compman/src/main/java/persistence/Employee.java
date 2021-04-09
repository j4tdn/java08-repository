package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "emp_id")
	private String emp_id;

	@Column(name = "emp_name")
	private String emp_name;

	@Column(name = "age")
	private Integer age;

	@Column(name = "salary")
	private Integer salary;

	@Column(name = "dept_id")
	private String dept_id;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String emp_id, String emp_name, Integer age, Integer salary, String dept_id) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.age = age;
		this.salary = salary;
		this.dept_id = dept_id;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	@Override
	public String toString() {
		return getEmp_id() + " " + getEmp_name() + " " + getAge() + " " + getSalary() + " " + dept_id ;
	}
}
