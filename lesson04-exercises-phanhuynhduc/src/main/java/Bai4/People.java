package Bai4;

import java.time.LocalDate;

public class People {
	
	protected String name ;
	protected LocalDate date;
	protected int heSoLuong ;
	
	public People() {
		
	}
	public People(String name , LocalDate date, int heSoLuong) {
		
		this.name = name ;
		this.date = date ;
		this.heSoLuong = heSoLuong;
		
	}
	
	
	public String getName() {
		return this.name ;
	}
	public void setName(String name ) {
		this.name = name ;
	}
	
	public LocalDate getDate() {
		return this.date;
		
	}
	
	public void setDate(LocalDate date) {
		this.date = date ;
	}
	
	public int getHeSoLuong() {
		return this.heSoLuong;
	}
	public void setHeSoLuong(int luong) {
		this.heSoLuong = luong;
	}
	
	public int calSalary() {
		return 0;
	}
	
	
	
}
