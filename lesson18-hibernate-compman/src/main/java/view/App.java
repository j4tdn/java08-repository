package view;

import service.EmployeeService;

public class App {

	private static EmployeeService employeeService;
	static {
		employeeService = new EmployeeService();
	}

	public static void main(String[] args) {
		System.out.println(employeeService.get("mgm-dn"));
		
		System.out.println("-----------------------------");
		
		// System.out.println(employeeService.getAll());
	}

}
