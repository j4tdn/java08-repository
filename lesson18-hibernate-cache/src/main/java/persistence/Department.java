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
@Table
public class Department {
	@Id
	@Column(name = "dept_id")
	private String dept_id;

	@Column(name = "dept_name")
	private String dept_name;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id")
	private Set<Employee> employees = new HashSet<Employee>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String dept_id, String dept_name) {
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	@Override
	public String toString() {
		return " depIt= "+ getDept_id() + ", depName= " + getDept_name();
	}

}