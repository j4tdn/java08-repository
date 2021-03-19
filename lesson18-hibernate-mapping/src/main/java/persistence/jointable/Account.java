package persistence.jointable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "account_number")
	private String accountNumber;

	@OneToOne(mappedBy = "account")
	private Employee employee;

	public Account(Integer id, String accountNumber) {
		this.id = id;
		this.accountNumber = accountNumber;
	}

}
