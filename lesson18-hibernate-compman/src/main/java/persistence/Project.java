package persistence;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@Column(name = "pro_id")
	private String proId;

	@Column(name = "pro_name")
	private String proName;

	private Double budget;

	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department department;

	@OneToMany(mappedBy = "project")
	private Set<ProjectEmployee> projectEmployees;
	
	public Project() {
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return proId + " | " + proName + " | " + budget + " | " + department;
	}
	
	

}
