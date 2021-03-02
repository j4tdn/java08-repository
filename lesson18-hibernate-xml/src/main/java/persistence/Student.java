package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "sinhvien")
@Data
@AllArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maSV")
	private Integer id;

	@Column(name = "ten")
	private String firstName;

	@Column(name = "ho")
	private String lastName;

	@Column(name = "email")
	private String email;

}
