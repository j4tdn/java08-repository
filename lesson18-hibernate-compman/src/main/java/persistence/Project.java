package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@Column(name = "pro_id")
	private String proId;
	@Column(name = "proName")
	private String proName;
	@Column(name = "budget")
	private Double budget;
	@Column(name = "dept_id")
	private String deptId;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String proId, String proName, Double budget, String deptId) {
		this.proId = proId;
		this.proName = proName;
		this.budget = budget;
		this.deptId = deptId;
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

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	
	
	
	

}
