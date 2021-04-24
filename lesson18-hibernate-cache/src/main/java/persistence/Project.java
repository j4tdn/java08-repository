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
	private String proId;

	@Column(name = "pro_name")
	private String proName;

	@Column(name = "budget")
	private Double budget;

	@ManyToOne
	@JoinColumn(name = "dept_id") // referent cho bang kia
	private Department department;

	public Project() {
		super();
	}

	public Project(String proId, String proName, Double budget, Department department) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.budget = budget;
		this.department = department;
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
		return department.getDepartmentName() + ", " + getProName()  + ", budget=" + budget;
	}

}
