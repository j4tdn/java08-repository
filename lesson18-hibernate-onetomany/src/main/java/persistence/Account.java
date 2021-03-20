package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "taikhoan")
public class Account {
	@Id
	@Column(name = "matk")
	private Integer id;
	
	@Column(name = "sotk")
	private String accountNumber;
	

	public Account() {
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Account(Integer id, String accountNumber, Employee employee) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
	}

	public Account(Integer id, String accountNumber) {
		this.id = id;
		this.accountNumber = accountNumber;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Id: " + id  + " " + "accounNumber: " + accountNumber;
	}
}
