package persistence.sharePk;

import persistence.sharePk.Account;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "first_name") 
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	@OneToOne  (cascade = CascadeType.ALL) // get lazy , Eager
	// hau nhu 99 % dung lazy
	@PrimaryKeyJoinColumn
	private Account account;

	public Employee(int i, String le, String na, String s, Account account) {
		this.id =i;
		this.firstName = le;
		this.lastName = na;
		this.email = s ;
		this.account = account ;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
		
}
