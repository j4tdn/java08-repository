package bai5;

public class Customer {
	private int id;
	private String hoTen;
	private String phone;
	private String diaChi;
	
	public Customer() {
	
	}

	public Customer(int id, String hoTen, String phone, String diaChi) {
		
		this.id = id;
		this.hoTen = hoTen;
		this.phone = phone;
		this.diaChi = diaChi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
}