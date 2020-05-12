package bean;

public class Customer {
	
	//attributes 
	private String fullName ;
	private String id ;
	private String phone ;
	private String address;
	
	//default constructor ;
	public Customer() {
		
	}
	public Customer(String fullName, String id, String phone, String address) {
		
		this.fullName = fullName;
		this.id = id;
		this.phone = phone;
		this.address = address;
	}
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
