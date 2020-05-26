package bean;

public class KhachHang {
	private String makh;
	private String tenkh;
	private String phone;
	private String diachi;
	

	public KhachHang() {
		
	};
	
	public KhachHang(String makh, String tenkh, String phone, String diachi) {

		this.makh = makh;
		this.tenkh = tenkh;
		this.phone = phone;
		this.diachi = diachi;
	}

	public String getMakh() {
		return makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

	public String getTenkh() {
		return tenkh;
	}

	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	};
	

}
