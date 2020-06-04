package Bai4;

import java.time.LocalDate;

public class TruongPhong extends People {

	private int employees ;
	
	public TruongPhong() {
		
	}
	public TruongPhong(String name , LocalDate date, int luong, int e) {
		
		super(name, date, luong);
		
		this.employees = e;
	}
	
	@Override
	public int calSalary() {
		
		return this.heSoLuong * 2200000;
	}
	
	
	
	
	
	
}
