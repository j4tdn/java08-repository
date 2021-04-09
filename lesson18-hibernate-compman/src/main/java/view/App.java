package view;

import java.util.List;

import dao.EmployeeDao;
import persistence.Employee;
import service.EmployeeService;

public class App {
	
	private static EmployeeService employeeService;
	
	static {
		employeeService = new EmployeeService();
	}
	
	public static void main(String[] args) {
//		List<Employee> emps = employeeService.getEmps("E1");
//		
//		for (Employee employee : emps) {
//			System.out.println(employee);
//		}
//		
//		System.out.println("connection: " + HibernateUtil.getSessionFactory());
		
		EmployeeDao empldao=new EmployeeDao();
		//List<Employee> result = empldao.getEmps("mgm-dn");
		List<Employee> result = empldao.getEmp();
		for(Employee e:result) {
			System.out.println(e);
		}
	}
}
