package view;

import java.util.List;

import persistence.Employee;
import service.EmployeeService;
import utils.HibernateUtil;

public class App {
	
	private static EmployeeService employeeService;
    static {
    	employeeService = new EmployeeService();
    }

	public static void main(String[] args) {
		System.out.println("conn: " + HibernateUtil.getSessionFactory());
		List<Employee> employees = employeeService.getAllEmployeesByDeptId("mgm-dn");
		System.out.println(employees);

	}

}
