package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sinhvien")
@Data
@NamedQueries({
	@NamedQuery(name = "Student.GET_ALL", query = "SELECT st FROM Student st")
})
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	public static final String GET_ALL = "Student.GET_ALL";
	
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maSV")
	private Integer id;

	@Column(name = "ten")
	private String firstName;

	@Column(name = "ho")
	private String lastName;

	@Column(name = "email")
	private String email;

}
