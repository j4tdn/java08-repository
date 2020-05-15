package bean;

public class Customer {
	// atributes
	private String id;
	private String fullname;
	private String phone;
	private String address;

	//contruster
	public Customer() {
	}

	public Customer(String fullname, String phone, String id, String address) {
	
		this.fullname = fullname;
		this.phone = phone;
		this.id = id;
		this.address = address;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
