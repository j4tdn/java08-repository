package bean;

public class Client {
	private String id;
	private String name;
	private int phoneNumber;
	private String address;
	
	public Client(String id, String name, int phoneNumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
