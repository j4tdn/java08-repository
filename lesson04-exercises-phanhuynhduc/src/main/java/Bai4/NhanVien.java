package Bai4;

import java.time.LocalDate;

public class NhanVien extends People {
	
	private String tenDonVi ;
	
	public NhanVien() {
		
	}
	public NhanVien(String name, LocalDate date, int luong, String ten) {
		super(name,date, luong);
		
		this.tenDonVi = ten;
	}
	
	
	
}
