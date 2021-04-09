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
	private String pro_id;
	
	@Column(name = "pro_name")
	private String pro_name;
	
	@Column(name = "budget")
	private Integer budget;
	
	public Project() {
	}

	
	public Project(String pro_id, String pro_name, Integer budget) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.budget = budget;
	}


	public String getPro_id() {
		return pro_id;
	}

	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	
	
}
