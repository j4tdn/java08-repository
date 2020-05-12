package Bean;

import java.time.LocalDate;

public class Card {
	
	
	
	
	
	
	private String maPhieuMuon ;
	private LocalDate ngayMuon ;
	private LocalDate ngayTra ;
	private Book sachDangMuon ;
	private Student SVdangMuon ;
	
	
	
	public Card() {
		
	}
	public Card(String maPhieuMuon,LocalDate ngayMuon,LocalDate ngayTra,Student student, Book book) {
		this.maPhieuMuon = maPhieuMuon ;
		this.ngayMuon = ngayMuon;
		this.ngayTra = ngayTra ;
		this.SVdangMuon = student;
		this.sachDangMuon = book;
	}	
	
	public void display() {
		
		System.out.println("Thong tin sinh vien : ");
		System.out.println("Ten sinh vien : " + this.SVdangMuon.getName());
		System.out.println("_________");
		System.out.println("Thong tin sach");
		System.out.println("Ten sach :" + this.sachDangMuon.getTenSach());
	}



	
	
	
}
