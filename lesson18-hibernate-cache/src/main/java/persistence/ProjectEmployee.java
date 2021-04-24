package persistence;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "project_employee")
public class ProjectEmployee {

	@EmbeddedId
	private Id id;

	@ManyToOne
	@JoinColumn(name = "pro_id", insertable = false, updatable = false)
	private Project project;

	@ManyToOne
	@JoinColumn(name = "emp_id", insertable = false, updatable = false)
	private Employee employee;

	private LocalDate startDate;

	public ProjectEmployee() {
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return id + " | " + startDate;
	}

	@Embeddable
	public class Id implements Serializable {

		private static final long serialVersionUID = 3521506227821892944L;

		@Column(name = "pro_id")
		private String proId;

		@Column(name = "emp_id")
		private String empId;

		public Id() {
		}
	}

}
