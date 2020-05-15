package encapsulation;

import java.time.LocalDate;
/* public, private,
 * protected, 
 * default: dong  goi trong package
 * nothing
 * 
 */
public class Employee {
	private String name;
	private int year;
	
	private String getName() {
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
	
	int getAge() {
		return LocalDate.now().getYear()-year;
	}
	
	
}
