package bean;

import java.time.LocalDate;

public class card {
	private String maphieu;
	private String sach;
	private student sinhvien;
	private LocalDate ngaymuon;
	private LocalDate ngaytra;
	private book[] books; 
	
	public card() {
	}
	
	public card(String maphieu, String sach, String sinhvien, LocalDate ngaymuon, LocalDate ngaytra) {
		super();
		this.maphieu = maphieu;
		this.sach = sach;
		this.sinhvien = sinhvien;
		this.ngaymuon = ngaymuon;
		this.ngaytra = ngaytra;
		
	}

	public String getMaphieu() {
		return maphieu;
	}
	public void setMaphieu(String maphieu) {
		this.maphieu = maphieu;
	}
	public String getSach() {
		return sach;
	}
	public void setSach(String sach) {
		this.sach = sach;
	}
	public String getSinhvien() {
		return sinhvien;
	}
	public void setSinhvien(String sinhvien) {
		this.sinhvien = sinhvien;
	}
	public LocalDate getNgaymuon() {
		return ngaymuon;
	}
	public void setNgaymuon(LocalDate ngaymuon) {
		this.ngaymuon = ngaymuon;
	}
	public LocalDate getNgaytra() {
		return ngaytra;
	}
	public void setNgaytra(LocalDate ngaytra) {
		this.ngaytra = ngaytra;
	}
	
	
	
}
