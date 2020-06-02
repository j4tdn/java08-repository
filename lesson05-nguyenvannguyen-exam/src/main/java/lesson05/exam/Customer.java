package lesson05.exam;

public class Customer {
	private String id;
	private String fullName;
	private String number;
	private String address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param fullName
	 * @param number
	 * @param address
	 */
	public Customer(String id, String fullName, String number, String address) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.number = number;
		this.address = address;
	}

	public String getId() {
		return id;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fullName=" + fullName + ", number=" + number + ", address=" + address + "]";
	}
	
	

}
