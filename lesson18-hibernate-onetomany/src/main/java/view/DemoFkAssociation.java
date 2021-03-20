package view;

import dao.EmployeeDao;
import persistence.Account;
import persistence.Employee;

public class DemoFkAssociation {
	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDao();
		
		Employee emp = new Employee(12, "Vu", "Duong", "vu_Duong@gmail.com");
		
		Account a1 = new Account(1, "A1");
		Account a2 = new Account(2, "A2");
		
		emp.getAccounts().add(a1);
		emp.getAccounts().add(a2);
		
		employeeDao.save(emp);
		System.out.println();

	}
}
