package view;

import dao.EmployeeDao;
import persistence.Employee;
import service.DepartmentService;
import service.EmployeeService;
import utils.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println(HibernateUtil.getSessionFactory());
		
		EmployeeService employeeService = new EmployeeService();
		
		DepartmentService departmentService = new DepartmentService();
		
//		var emps =  employeeService.getEmployeeByDepartmentId("mgm-dn");
//		emps.forEach(System.out::println);
		
		var departments = departmentService.getAll();
		
		departments.forEach(System.out::println);
	}
}
