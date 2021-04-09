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
	@Column(name = "mataikhoan")
	private Integer id;

	@Column(name = "sotaikhoan")
	private String accountNumber;

	public Account() {
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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
