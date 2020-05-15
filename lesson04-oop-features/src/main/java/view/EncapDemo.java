package view;

import encapsulation.Employee;

public class EncapDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setYear(1997);
		
		//access modifier: default, protected
		//System.out.println("Age: " + emp.getAge());
	}
}
