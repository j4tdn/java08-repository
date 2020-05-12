package bean;

public class Book {
	@Override
	public String toString() {
		return "Book [soHieuSach=" + soHieuSach + ", tenSach=" + tenSach + ", nhaXuatBan=" + nhaXuatBan + "]";
	}

	private String soHieuSach;
	private String tenSach;
	private String nhaXuatBan;
	
	public Book() {
		
	}

	public Book(String soHieuSach, String tenSach, String nhaXuatBan) {
		super();
		this.soHieuSach = soHieuSach;
		this.tenSach = tenSach;
		this.nhaXuatBan = nhaXuatBan;
	}

	public String getSoHieuSach() {
		return soHieuSach;
	}

	public void setSoHieuSach(String soHieuSach) {
		this.soHieuSach = soHieuSach;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	
}
