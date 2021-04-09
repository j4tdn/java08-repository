package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private int age;
	
	@Column(name = "salary")
	private int salary;
	
	@ManyToOne()
	@JoinColumn(name = "dept_id", nullable = false)
	private Department department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param emp_id
	 * @param emp_name
	 * @param age
	 * @param salary
	 * @param department
	 */
	public Employee(String emp_id, String emp_name, int age, int salary, Department department) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.age = age;
		this.salary = salary;
		this.department = department;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", age=" + age + ", salary=" + salary
				+ ", department=" + department + "]";
	}

	

}
