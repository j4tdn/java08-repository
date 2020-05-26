package bai5;

public class Book {
	private String maSach;
	private Double donGia;
	private String nhaXuatBan;
	
	public Book() {
		super();
	}

	public Book(String maSach, Double donGia, String nhaXuatBan) {
		super();
		this.maSach = maSach;
		this.donGia = donGia;
		this.nhaXuatBan = nhaXuatBan;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public Double getDonGia() {
		return donGia;
	}

	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	
}