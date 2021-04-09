package persistence;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "du_an")
public class Project {
	
	@Id
	@Column(name ="mada")
	private Integer id;
	
	@Column(name = "mo_ta")
	private String desc;
	
	@Column(name = "tien")
	private Integer budget;
	
	
	@ManyToMany(mappedBy = "projects", cascade = CascadeType.ALL)
	private Set<Employee> employees = new HashSet<>();
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(Integer id, String desc, Integer budget) {
		super();
		this.id = id;
		this.desc = desc;
		this.budget = budget;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}