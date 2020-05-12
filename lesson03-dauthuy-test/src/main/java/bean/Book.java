package bean;

import java.time.LocalDate;

public class Book {
	private String soHieuSach;
	private String tenSach;
	private String NXB;
	
	public Book(String soHieuSach, String tenSach, String nXB) {
		super();
		this.soHieuSach = soHieuSach;
		this.tenSach = tenSach;
		NXB = nXB;
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

	public String getNXB() {
		return NXB;
	}

	public void setNXB(String nXB) {
		NXB = nXB;
	}
	
	@Override
	public String toString() {
		return "so hieu sach: " + soHieuSach + " \nten sach: " + tenSach + " \nNXB: : " + NXB ;
	}
	
	
}
