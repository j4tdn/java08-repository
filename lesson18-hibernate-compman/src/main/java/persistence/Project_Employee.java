package persistence;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project_employee")
public class Project_Employee {
	@Id
	@Column(name = "pro_id")
	private String pro_id;

	@Column(name = "emp_id")
	private String emp_id;

	@Column(name = "start_date")
	private Date start_date;

	public Project_Employee() {
		// TODO Auto-generated constructor stub
	}

	public Project_Employee(String pro_id, String emp_id, Date start_date) {
		this.pro_id = pro_id;
		this.emp_id = emp_id;
		this.start_date = start_date;
	}

	public String getPro_id() {
		return pro_id;
	}

	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

}
