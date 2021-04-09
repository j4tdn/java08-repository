package persistence;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "project_employee")
public class ProjectEmployee {

	@EmbeddedId
	private Id id;

	@Column(name = "start_date")
	private Date startDate;

	public ProjectEmployee() {
	}

	public ProjectEmployee(Id id, Date startDate) {
		super();
		this.id = id;
		this.startDate = startDate;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Embeddable
	public static class Id implements Serializable {
		private static final long serialVersionUID = 1L;

		@Column(name = "pro_id")
		private String proId;

		@Column(name = "emp_id")
		private String empId;

		public String getProId() {
			return proId;
		}

		public void setProId(String proId) {
			this.proId = proId;
		}

		public String getEmpId() {
			return empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		@Override
		public String toString() {
			return "Id [proId=" + proId + ", empId=" + empId + "]";
		}

	}

	@Override
	public String toString() {
		return "ProjectEmployee [id=" + id + ", startDate=" + startDate + "]";
	}

}
