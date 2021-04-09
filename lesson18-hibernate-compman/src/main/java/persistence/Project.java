package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@Column(name = "pro_id")
	private String id;
	
	@Column(name = "pro_name")
	private String name;
	
	@Column(name = "budget")
	private Integer budget;
	
	
	@ManyToOne()
	@JoinColumn(name = "dept_id", nullable = false)
	private Department department;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Project(String id, String name, Integer budget) {
		super();
		this.id = id;
		this.name = name;
		this.budget = budget;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
