package persistence;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@Column(name = "dept_id")
	private String deptId;

	@Column(name = "dept_name")
	private String devtName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_id")
	private List<Employee> employees;

	public Department() {

	}

	public Department(String deptId, String devtName) {
		this.deptId = deptId;
		this.devtName = devtName;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDevtName() {
		return devtName;
	}

	public void setDevtName(String devtName) {
		this.devtName = devtName;
	}

}
