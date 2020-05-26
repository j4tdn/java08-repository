package Bai05;

public class KH {
	private String Id_Custemor;
	private String Name;
	private String PhoneNumber;
	private String Address;

	public KH() {
		// TODO Auto-generated constructor stub
	}

	public KH(String id, String name, String phoneNumber, String address) {
		super();
		Id_Custemor = id;
		Name = name;
		PhoneNumber = phoneNumber;
		Address = address;
	}

	public String getId() {
		return Id_Custemor;
	}

	public void setId(String id) {
		Id_Custemor = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
