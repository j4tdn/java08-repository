package view;

import java.util.List;

import dao.EmployeeDao;
import persistence.Employee;
import service.EmployeeService;

public class App {
	
	public static void main(String[] args) {
		EmployeeDao empldao = new EmployeeDao();
		List<Employee> result1 = empldao.getEmps("mgm-dn");
		for (Employee e1 : result1) {
			System.out.println(e1);
		}
		
		System.out.println("=====2=====");
		List<Employee> result2 = empldao.getEmpsFromDept();
		for (Employee e2 : result2) {
			System.out.println(e2);
		}
	}
	
	
	
	
	private static EmployeeService employeeService;
	static {
		employeeService = new EmployeeService();
	}

	/*
	 * public static void main(String[] args) { System.out.println("conn: " +
	 * HibernateUtil.getSessionFactory()); List<Employee> emps =
	 * employeeService.getEmps("mgm-dn"); emps.forEach(System.out::println);
	 * 
	 * }
	 */
	
}
