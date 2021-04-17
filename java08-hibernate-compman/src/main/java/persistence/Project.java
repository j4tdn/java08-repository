package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@Column(name = "bubget")
	private Double bubget;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id",nullable = false)
	private Department department;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param bubget
	 * @param department
	 */
	public Project(String id, String name, Double bubget, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.bubget = bubget;
		this.department = department;
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

	public Double getBubget() {
		return bubget;
	}

	public void setBubget(Double bubget) {
		this.bubget = bubget;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", bubget=" + bubget + ", department=" + department + "]";
	}
	
	

}
