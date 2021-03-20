package view;

import dao.EmployeeDao;
import persistence.Account;
import persistence.Employee;

public class DemofkAssociation {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		
		Employee emp = new Employee(12, "w@gmail.com", "Teo", "Le");
		
		Account a1 = new Account(1, "111");
		Account a2 = new Account(2, "111");
		
		emp.getAccounts().add(a1);
		emp.getAccounts().add(a2);
		
		dao.save(emp);
		
		System.out.println(emp);
		System.out.println(emp.getAccounts().size());
	}
}
