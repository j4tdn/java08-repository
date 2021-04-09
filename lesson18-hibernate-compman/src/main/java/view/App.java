package view;

import java.util.List;

import dao.DepartmentDao;
import dao.EmployeeDao;
import dao.DepartmentDao;
import dao.EmployeeDao;
import persistence.Department;
import persistence.Employee;
import persistence.Project;
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
		List<Employee> emps = employeeService.getEmps("mgm-dn");
		emps.forEach(System.out::println);
		
		System.out.println("============");
		
		List<Employee> allEmps = employeeService.getAll();
		allEmps.forEach(System.out::println);
		
		System.out.println("============");
		
		List<Project> pros = projectService.getPros(400);
		pros.forEach(System.out::println);
	}
}
