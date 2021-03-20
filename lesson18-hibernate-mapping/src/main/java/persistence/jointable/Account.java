package persistence.jointable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import persistence.jointable.Employee;

import javax.persistence.*;

@Entity
@Table(name = "account")
@AllArgsConstructor
@Getter
@Setter
public class Account {
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "account_number")
	private String accountNumber;
	
	@OneToOne(mappedBy = "account")

	private Employee employee;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(Integer id, String accountNumber) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + "]";
	}
	
	
}
