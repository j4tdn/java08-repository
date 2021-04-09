package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@NoArgsConstructor
public class Employee {
	@Id
	@Column(name = "emp_id")
	private String empId;

	@Column(name = "emp_name")
	private String empName;

	private Integer age;

	private Double salary;

	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department department;

	@Override
	public String toString() {
		return department.toString() + " - " + empId + " - " + empName + " - " + age + " - " + salary + " - "
				+ department;
	}
}
