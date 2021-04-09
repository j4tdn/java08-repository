package persistence;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "project_employee")
public class ProjectEmployee {
	@EmbeddedId
	private Id id;

	@Column(name = "start_date")
	private LocalDate date;
	
	@Embeddable
	public static class Id {

		@Column(name = "pro_id")
		private String projectId;
		@Column(name = "emp_id")
		private String empId;

		public Id() {
			// TODO Auto-generated constructor stub
		}

		public Id(String projectId, String empId) {
			super();
			this.projectId = projectId;
			this.empId = empId;
		}

	}
	
	public ProjectEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	
}
