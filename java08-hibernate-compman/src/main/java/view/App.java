package view;

import java.util.List;

import dao.HibernateEmployeeDao;
import persistence.Department;
import persistence.Employee;
import persistence.Project;
import service.DepartmentService;
import service.EmployeeService;
import service.ProjectService;

public class App {
	public static void main(String[] args) {
		EmployeeService empService = new EmployeeService();
		List<Employee> emp = empService.getEmployeeByDepartment("mgm-dn");
		
		for (Employee employee : emp) {
			System.out.println(employee.toString());
		}
		
		DepartmentService dept = new DepartmentService();
		List<Department> depts = dept.getDepartment();
		for (Department department : depts) {
			System.out.println(department.toString());
		}
		
		ProjectService projectService = new ProjectService();
		List<Project> project = projectService.getProject(400);		
		for (Project project2 : project) {
			System.out.println(project2.toString());
		}
		
	}

}
