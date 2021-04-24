package persistence;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table (name = "department")
public class Department {
	@Id
	@Column(name = "dept_id")
	private String deptId;

	@Column(name = "dept_name")
	private String dept_name;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id")
	private Set<Employee> employees = new HashSet<Employee>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String deptId, String dept_name) {
		this.deptId = deptId;
		this.dept_name = dept_name;
	}

	public String getDept_id() {
		return deptId;
	}

	public void setDept_id(String deptId) {
		this.deptId = deptId;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	@Override
	public String toString() {
		return getDept_id() + " " + getDept_name();
	}

}