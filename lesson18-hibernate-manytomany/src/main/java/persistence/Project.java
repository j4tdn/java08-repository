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
@Table(name = "duan")
public class Project {

	@Id
	@Column(name = "mada")
	private Integer id;

	@Column(name = "mota")
	private String desc;

	@Column(name = "sotien")
	private Integer budget;
	
//	@ManyToMany(mappedBy = "projects", cascade = CascadeType.ALL)
//	private Set<Employee> employees = new HashSet<>();

	public Project() {
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
	
//	public Set<Employee> getEmployees() {
//		return employees;
//	}
//	
//	public void setEmployees(Set<Employee> employees) {
//		this.employees = employees;
//	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", desc=" + desc + ", budget=" + budget + "]";
	}

}
