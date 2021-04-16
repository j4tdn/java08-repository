package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "duan")
public class Project {

	@Id
	@Column(name = "madu")
	private Integer id;

	@Column(name = "mota")
	private String desc;

	@Column(name = "sotien")
	private Integer budger;

	

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

	public Integer getBudger() {
		return budger;
	}

	public void setBudger(Integer budger) {
		this.budger = budger;
	}

//	public Set<Employee> getEmployees() {
//		return employees;
//	}
//
//	public void setEmployees(Set<Employee> employees) {
//		this.employees = employees;
//	}

	public Project(Integer id, String desc, Integer budger) {
		this.id = id;
		this.desc = desc;
		this.budger = budger;
	}

	public Project() {
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", desc=" + desc + ", budger=" + budger + "]";
	}

}
