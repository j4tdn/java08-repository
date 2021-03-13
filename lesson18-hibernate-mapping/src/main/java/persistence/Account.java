package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = " account")
public class Account {
	
	@Id
	@Column(name= "id")
	private Integer id;
	@Column(name= "accountNumber")
	private String accountNumber;
	@OneToOne(mappedBy = "account_id")
	private Employee employee;
	public Account() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param accountNumber
	 */
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
	
	

}
