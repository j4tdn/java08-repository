package bean;

public class Customer {
	private String IdCustomer;
	private String Name;
	private int phone;
	private String Address;

	public Customer() {

	}

	public Customer(String idCustomer, String name, int phone, String address) {
		super();
		IdCustomer = idCustomer;
		Name = name;
		this.phone = phone;
		Address = address;
	}

	public String getIdCustomer() {
		return IdCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		IdCustomer = idCustomer;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
