package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "accountNumber")
	private String accountNumber;
	
	public Account(Integer id, String accountNumber) {
		this.id = id;
		this.accountNumber = accountNumber;
	}
	
	@OneToOne(mappedBy = "account") //quan hệ 2 chiều, bên kia cũng lấy được
	private Employee employee;

	public Account() {
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
		return "Id: " + id  + " " + "accounNumber: " + accountNumber;
	}
}
