package NVNguyen.Lesson03;

public class Sach {
	private String soHieuSach;
	private String tenSach;
	private String nhaSuatBan;
	
	public Sach() {
		// TODO Auto-generated constructor stub
	}

	public Sach(String soHieuSach, String tenSach, String nhaSuatBan) {
		super();
		this.soHieuSach = soHieuSach;
		this.tenSach = tenSach;
		this.nhaSuatBan = nhaSuatBan;
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

	public String getNhaSuatBan() {
		return nhaSuatBan;
	}

	public void setNhaSuatBan(String nhaSuatBan) {
		this.nhaSuatBan = nhaSuatBan;
	}
	
	

}
