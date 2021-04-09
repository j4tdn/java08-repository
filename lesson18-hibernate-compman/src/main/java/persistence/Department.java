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

@Entity
@Table(name = "department")
public class Department {
		@Id
		@Column(name = "dept_id")
		private String deptId;
		
		@Column(name="dept_name")
		private String deptName;
		
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		@JoinColumn(name = "dept_id")
		private Set<Employee> employees = new HashSet();
		
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		@JoinColumn(name = "dept_id")
		private Set<Project> project = new HashSet();
		
		public Department(){
			
			}


		public String getDeptId() {
			return deptId;
		}


		public void setDeptId(String deptId) {
			this.deptId = deptId;
		}


		public String getDeptName() {
			return deptName;
		}


		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}


		public Set<Employee> getEmployees() {
			return employees;
		}


		public void setEmployees(Set<Employee> employees) {
			this.employees = employees;
		}


		public Set<Project> getProject() {
			return project;
		}


		public void setProject(Set<Project> project) {
			this.project = project;
		}


		
		
}
