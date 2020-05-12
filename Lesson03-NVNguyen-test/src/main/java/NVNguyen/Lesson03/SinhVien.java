package NVNguyen.Lesson03;

import java.time.LocalDate;

public class SinhVien {
	private String hoTen;
	private String lop;
	private LocalDate ngaySinh;
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String hoTen, String lop, LocalDate ngaySinh) {
		super();
		this.hoTen = hoTen;
		this.lop = lop;
		this.ngaySinh = ngaySinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	

}
