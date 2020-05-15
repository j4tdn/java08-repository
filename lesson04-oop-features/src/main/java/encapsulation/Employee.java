package encapsulation;

import java.time.LocalDate;

public class Employee {
	//access modifier: public, private, protected, default [nothing]
	private String name;
	private int year; //class ben ngaoi ko goi dc
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) { // ko cos gi = private
		this.year = year;
	}
	protected int getAge() { // trong class ko dc khai bao default, trong interface
		return LocalDate.now().getYear() - year;
	}
	
	
}
