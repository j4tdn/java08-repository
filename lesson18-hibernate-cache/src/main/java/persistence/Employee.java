package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private String id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "salary")
	private Integer salary;
	
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department department;

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", departmentId="
				+ department + "]";
	}
	
	
	
	
}
