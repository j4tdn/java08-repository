package persistence;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
public class Project {
	@Id
	private String proId;

	private String proName;

	private Double budget;

	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;

}
