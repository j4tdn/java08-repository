package view;

import java.util.List;

import persistence.Department;
import persistence.Employee;
import persistence.Project;
import persistence.ProjectDTO;
import service.DepartmentService;
import service.EmployeeService;
import service.ProjectService;
import utils.hibernateUtil;

public class view {
	public static void main(String[] args) {
		System.out.println("conn" + hibernateUtil.getSessionFactory());
		EmployeeService employeeService = new EmployeeService();
		DepartmentService departmentService = new DepartmentService();
		ProjectService projectService = new ProjectService();
		List<Employee> employee1 = employeeService.getAllByDepartmentId("mgm-dn");
		List<Department> department = departmentService.getAllDepartment();
		List<Project> projects = projectService.getProjectByBudget(400d);
//		for (Employee employee : employee1) {
//			System.out.println(employee);
//		}
		System.out.println("----------------------");
		
		for (Department d : department) {
			System.out.println(d);
		}
		System.out.println("----------------------");
		for (Project d : projects) {
			System.out.println(d);
		}
		List<ProjectDTO> proBudget = projectService.getProBudget();
		proBudget.forEach(System.out::println);
	}
}
