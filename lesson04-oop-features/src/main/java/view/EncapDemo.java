package view;

import encapsulation.Employee;

public class EncapDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setYear(20);
		
		System.out.println("Year: " + emp.getYear());
	}
}
