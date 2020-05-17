package bean;

public class Customer {
	// attributes
	private String id;
	private String fullname;
	private String phone;
	private String address;

	// default constructor
	public Customer() {

	}

	public Customer(String id, String fullname, String phone, String address) {
		this.id = id;
		this.fullname = fullname;
		this.phone = phone;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}


