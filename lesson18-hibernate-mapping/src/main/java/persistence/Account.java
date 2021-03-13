package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "account")
public class Account {
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="account_number")
	private String accountNummber;
	
	@OneToOne(mappedBy = "account")
	private Employee employee;

	public Account() {

	}

	public Account(Integer id, String accountNummber) {
		super();
		this.id = id;
		this.accountNummber = accountNummber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountNummber() {
		return accountNummber;
	}

	public void setAccountNummber(String accountNummber) {
		this.accountNummber = accountNummber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
