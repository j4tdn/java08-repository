package ex05;

public class Customer {
	private int idCustomer;
	private String nameCustomer;
	private String phoneNumber;
	private String address;
	private Textbook[] textbooks = new Textbook[2];

	public Customer(int idCustomer, String nameCustomer, String phoneNumber, String address, Textbook[] textbooks) {
		super();
		this.idCustomer = idCustomer;
		this.nameCustomer = nameCustomer;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.textbooks = textbooks;
	}

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
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

	public Textbook[] getTextbooks() {
		return textbooks;
	}

	public void setTextbooks(Textbook[] textbooks) {
		this.textbooks = textbooks;
	}

	public int getTotalTextBook() {
		int sum = 0;
		for (int i = 0; i < textbooks.length; i++) {
//			if(textbooks[i])
		}
		return sum;
	}

	@Override
	public String toString() {
		return "ReferenceBooks [idCustomer=" + idCustomer + ", nameCustomer=" + nameCustomer + ", phoneNumber="
				+ phoneNumber + ", address=" + address + "]";
	}
}
