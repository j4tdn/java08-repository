package view;

import java.util.List;

import persistence.Employee;
import persistence.Project;
import persistence.ProjectDto;
import persistence.ProjectDtoRawData;
import service.DepartmentService;
import service.EmployeeService;
import service.ProjectService;
import utils.HibernateUtil;

public class App {

	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static ProjectService projectService;
	
	static {
		employeeService = new EmployeeService();
		departmentService = new DepartmentService();
		projectService = new ProjectService();
	}

	public static void main(String[] args) {
		System.out.println("==============1==============");
		
		List<Employee> emps = employeeService.getEmployeesByDepartmentId("mgm-dn");
		emps.forEach(System.out::println);
		
		System.out.println("==============2==============");
		
		List<Employee> allEmps = employeeService.getAll();
		allEmps.forEach(System.out::println);
		
		System.out.println("==============3==============");
		
		List<Project> pros = projectService.getProjects(400);
		pros.forEach(System.out::println);
		
		System.out.println("==============4==============");
		
		List<ProjectDto> probudgets = projectService.getProBudgets();
		probudgets.forEach(System.out::println);
	}
}
