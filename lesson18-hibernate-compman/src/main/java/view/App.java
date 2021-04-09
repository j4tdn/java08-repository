package view;

import java.util.List;

import dao.EmployeeDao;
import persistence.Employee;


public class App {
	public static void main(String[] args) {
		EmployeeDao empldao=new EmployeeDao();
		//List<Employee> result=empldao.getEmps("mgm-dn");
		List<Employee> result=empldao.getEmp();
		for(Employee e:result) {
			System.out.println(e);
		}
	}
}
