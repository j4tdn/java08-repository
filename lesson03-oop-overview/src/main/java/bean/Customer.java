package bean;

public class Customer {

	// attributes
		private String id;
		private String fullName;
		private String phone;
		private String address;

	// default contructor
	public Customer() {
		// ctrl space de ra
	}
	
	public String getId() {
		return id;
	}

	public Customer(String id, String fullName, String phone, String address) {
		this.id = id;
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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
