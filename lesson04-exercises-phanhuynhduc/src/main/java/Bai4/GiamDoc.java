package Bai4;

import java.time.LocalDate;

public class GiamDoc extends People {

	private int heSoChucVu ;
	
	public GiamDoc() {
		
		
	}
	public GiamDoc(String name , LocalDate date, int luong, int heSoChucVu) {
		
		super(name ,date, luong);
		
		this.heSoChucVu = heSoChucVu;
		
		
	}
	
	public int calSalary() {
		return ( this.heSoLuong + this.heSoChucVu) * 3000000;
		
	}
	
	
	
	
	
}
