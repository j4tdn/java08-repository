package view;

import service.EmployeeService;
import service.ProjectService;

public class App {

	private static EmployeeService employeeService;
	private static ProjectService projectService;
	static {
		employeeService = new EmployeeService();
		projectService = new ProjectService();
	}

	public static void main(String[] args) {
		employeeService.get("mgm-dn").forEach(System.out::println);

		System.out.println("-----------------------------");

		employeeService.getAll().forEach(System.out::println);

		System.out.println("-----------------------------");

		projectService.get(400.0).forEach(System.out::println);
		
		System.out.println("-----------------------------");

		projectService.getTotalOfBudget(2021).forEach(System.out::println);
		
		System.out.println("-----------------------------");

		System.out.println(projectService.getHighestBudget(2021));
				
	}

}
