package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "firt_name")
	private String firtname;
	@Column(name = "last_name")
	private String lastname;
	@Column(name = "email")
	private String email;
	@OneToOne
	@JoinColumn(name = "account_id", nullable = false)
	private Account account;
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Employee() {
		
	}

	/**
	 * @param id
	 * @param firtname
	 * @param lastname
	 * @param email
	 */
	public Employee(Integer id, String firtname, String lastname, String email) {
		super();
		this.id = id;
		this.firtname = firtname;
		this.lastname = lastname;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirtname() {
		return firtname;
	}

	public void setFirtname(String firtname) {
		this.firtname = firtname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
