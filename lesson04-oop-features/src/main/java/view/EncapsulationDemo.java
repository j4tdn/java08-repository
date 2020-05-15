package view;

import encapsulation.Employee;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setYear(2000);;
		
		System.out.println("Age: "+emp.getYear());
	}

}
