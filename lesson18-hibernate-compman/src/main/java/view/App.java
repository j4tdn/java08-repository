package view;

import java.util.List;

import dto.ProjectDto;
import persistence.Employee;
import persistence.Project;
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
//		List<Employee> emps = employeeService.getEmps("mgm-dn");
//		emps.forEach(System.out::println);
		
		System.out.println("=========================");
		
//		List<Project> projects = projectService.getProjects(400);
//		System.out.println(projects);
		
		System.out.println("=========================");
		
		List<ProjectDto> proBudgets = projectService.getProBudgets();
		proBudgets.forEach(System.out::println);
	
	}
}