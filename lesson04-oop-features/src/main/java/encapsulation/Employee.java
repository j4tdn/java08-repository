package encapsulation;

import java.time.LocalDate;

public class Employee {
	
	//ACCESS MODIFIER ( public , private , protected  , [nothing])
	
	// tinhs chat dong goi duoc the hien qua access modifier ( giair thich public , private , protected, [nothing ] )
	
	
	
	private String name ;
	private int year ;
	
	
	public String getName() {
		return this.name;
	}
	public int getYear() {
		return this.year;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setYear(int year) {
		this.year = year;
	}
	protected int getAge() {
		return LocalDate.now().getYear() - this.year;
	}
	
}
