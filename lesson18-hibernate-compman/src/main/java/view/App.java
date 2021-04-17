package view;

import java.util.List;

import persistence.Employee;
import persistence.Project;
import persistence.ProjectDto;
import service.EmployeeService;
import service.ProjectService;

public class App {
	
	private static EmployeeService employeeService;
	private static ProjectService projectSerivce;
	
	static {
		employeeService = new EmployeeService();
		projectSerivce = new ProjectService();
	}
	
	public static void main(String[] args) {
		List<Employee> emps = employeeService.getEmps("mgm-dn");
		emps.forEach(System.out::println);
		
		System.out.println("=============3===========");
		List<Project> projects = projectSerivce.getProjects(400);
		projects.forEach(System.out::println);
		
		System.out.println("=============4===========");
		List<ProjectDto> proBudgets = projectSerivce.getProBudgets();
		proBudgets.forEach(System.out::println);
		
		
	}
}
