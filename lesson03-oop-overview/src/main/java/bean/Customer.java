package bean;

public class Customer {	
	private String idCard;
	private String name;
	private String phoneNumber;
	private String address;	
	
	public Customer() {
	}

	public Customer(String idCard, String name, String phoneNumber, String address) {
		this.idCard = idCard;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [idCard=" + idCard + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ "]";
	}		
	
	
}
