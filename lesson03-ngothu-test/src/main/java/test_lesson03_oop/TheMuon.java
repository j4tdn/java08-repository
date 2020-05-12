package test_lesson03_oop;

import java.time.LocalDate;

public class TheMuon {
	public String ma_phieu_muon;
	public LocalDate ngay_muon;
	public LocalDate ngay_tra;
	public String sach_dang_muon;
	public String sinh_vien_dang_muon;
	public TheMuon() {
		
	}
	
	public TheMuon(String ma_phieu_muon, LocalDate ngay_muon, LocalDate ngay_tra, String sach_dang_muon,
			String sinh_vien_dang_muon) {
		super();
		this.ma_phieu_muon = ma_phieu_muon;
		this.ngay_muon = ngay_muon;
		this.ngay_tra = ngay_tra;
		this.sach_dang_muon = sach_dang_muon;
		this.sinh_vien_dang_muon = sinh_vien_dang_muon;
	}

	public String getMa_phieu_muon() {
		return ma_phieu_muon;
	}
	public void setMa_phieu_muon(String ma_phieu_muon) {
		this.ma_phieu_muon = ma_phieu_muon;
	}
	public LocalDate getNgay_muon() {
		return ngay_muon;
	}
	public void setNgay_muon(LocalDate ngay_muon) {
		this.ngay_muon = ngay_muon;
	}
	public LocalDate getNgay_tra() {
		return ngay_tra;
	}
	public void setNgay_tra(LocalDate ngay_tra) {
		this.ngay_tra = ngay_tra;
	}
	public String getSach_dang_muon() {
		return sach_dang_muon;
	}
	public void setSach_dang_muon(String sach_dang_muon) {
		this.sach_dang_muon = sach_dang_muon;
	}
	public String getSinh_vien_dang_muon() {
		return sinh_vien_dang_muon;
	}
	public void setSinh_vien_dang_muon(String sinh_vien_dang_muon) {
		this.sinh_vien_dang_muon = sinh_vien_dang_muon;
	}

}
