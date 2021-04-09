package persistence;

import java.time.LocalDate;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="project_employee")
@Data
@NoArgsConstructor
public class ProjectEmployee {

	@EmbeddedId
	private Id id;
	
	private LocalDate startDate;
	
	@Embeddable
	@Data
	public static class Id {
		private String proId;
		private String empId;
	}	
}



