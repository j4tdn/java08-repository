package persistence;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "department")
@NoArgsConstructor
public class Department {
	@Id
	@Column(name = "dept_id")
	private String deptId;

	@Column(name = "dept_name")
	private String deptName;

	@OneToMany(mappedBy = "department")
	private Set<Employee> employees;

	@OneToMany(mappedBy = "dept_id")
	private Set<Project> projects;


}
