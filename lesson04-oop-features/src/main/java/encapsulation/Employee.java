package encapsulation;

import java.time.LocalDate;

public class Employee {
	// access modifiler: public , private, protected(phan vi package), default( k co access, co default), nothing.
	
	private String name;
	private int year;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	protected int getAge() {
		// lay nam hien tai 
		return LocalDate.now().getYear() - year;
	}
	
	
	
}
