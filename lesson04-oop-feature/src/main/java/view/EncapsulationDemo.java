package view;

import encapsulation.Employee;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setYear(20);
		
		// Access modifer: default || protected
		// System.out.println("Age" + employee.getAge());
	}
}
