package bean;

import java.time.LocalDate;

public class Card {
	private String ma;
	private LocalDate ngayMuon;
	private LocalDate hanTra;
	private Book sachDangMuon;
	private Student sinhVienMuon;
	
	public Card(String ma, LocalDate ngayMuon, LocalDate hanTra, Book sachDangMuon, Student sinhVienMuon) {
		super();
		this.ma = ma;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.sachDangMuon = sachDangMuon;
		this.sinhVienMuon = sinhVienMuon;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public LocalDate getNgayMuon() {
		return ngayMuon;
	}

	public void setNgayMuon(LocalDate ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public LocalDate getHanTra() {
		return hanTra;
	}

	public void setHanTra(LocalDate hanTra) {
		this.hanTra = hanTra;
	}

	public Book getSachDangMuon() {
		return sachDangMuon;
	}

	public void setSachDangMuon(Book sachDangMuon) {
		this.sachDangMuon = sachDangMuon;
	}

	public Student getSinhVienMuon() {
		return sinhVienMuon;
	}

	public void setSinhVienMuon(Student sinhVienMuon) {
		this.sinhVienMuon = sinhVienMuon;
	}
	
	@Override
	public String toString() {
		return "ma: " + ma + " \nngay muon: " + ngayMuon + " \nhan tra: : " + hanTra + " \nsach dang muon: "
				+ sachDangMuon + " \nsinh vien muon: " + sinhVienMuon;
	}
}
