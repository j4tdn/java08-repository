package view;

import dao.EmployeeDao;
import persistence.Employee;
import service.DepartmentService;
import service.EmployeeService;
import service.ProjectService;
import utils.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println(HibernateUtil.getSessionFactory());
		
		EmployeeService employeeService = new EmployeeService();
		
		DepartmentService departmentService = new DepartmentService();
		
		ProjectService projectService = new ProjectService();
		
//		var emps =  employeeService.getEmployeeByDepartmentId("mgm-dn");
//		emps.forEach(System.out::println);
		
//		var departments = departmentService.getAll();
		
		var projects = projectService.getProbudgets();
		projects.forEach(System.out::println);
	}
}
