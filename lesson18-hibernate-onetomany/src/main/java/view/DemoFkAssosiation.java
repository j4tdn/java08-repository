package view;

import dao.EmployeeDao;
import persistence.Account;
import persistence.Employee;

public class DemoFkAssosiation {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		Account account1 = new Account(1, "123123");
		Account account2 = new Account(2, "321321");
	
		Employee employee = new Employee(1,"lamtran@gmail.com", "lam", "tran");
		
		employee.getAccounts().add(account1);
		employee.getAccounts().add(account2);
		dao.save(employee);
		System.out.println(employee);
		System.out.println(employee.getAccounts());
		
	}

}
