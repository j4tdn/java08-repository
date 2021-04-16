package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "taikhoan")
public class Account {

	@Id
	@Column(name = "matk")
	private Integer id;

	@Column(name = "sotk")
	private String accountNumber;

//	@ManyToOne
//	@JoinColumn(name = "manv")
//	private Employee emloyee;

	public Account() {
		super();
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
