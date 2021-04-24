package persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="project_employee")
public class Project_Employee {
	
	private String proId;
	
	private String empID;
	
	@Column(name="start_date")
	private Date startDate;

}
