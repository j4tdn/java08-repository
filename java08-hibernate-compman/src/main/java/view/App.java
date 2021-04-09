package view;

import java.util.List;

import dao.HibernateEmployeeDao;
import persistence.Employee;

public class App {
	public static void main(String[] args) {
		HibernateEmployeeDao item = new HibernateEmployeeDao();
		List<Employee> emp = item.getListEmployee("mgm-dn");
		for (Employee employee : emp) {
			System.out.println(employee.toString());
		}
	}

}
