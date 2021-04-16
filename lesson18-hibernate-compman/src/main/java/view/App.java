package view;

import java.util.List;

import persistence.Employee;
import service.EmployeeService;

public class App {
	
	private static EmployeeService employeeService;
	
	static {
		employeeService = new EmployeeService();
	}
	
	public static void main(String[] args) {
		List<Employee> emps = employeeService.getEmps("mgm-dn");
		emps.forEach(System.out::println);
	}
}
