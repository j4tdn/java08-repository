package view;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.Account;
import persistence.Employee;

public class DemoFkAssociation {
	private static AccountDao accountDao;
	private static EmployeeDao employeeDao;

	static {
		accountDao = new HibernateAccountDao();
		employeeDao = new HibernateEmployeeDao();
	}

	public static void main(String[] args) {
		Account account = new Account(123, "123-685-471");
		Employee emp = new Employee(1, "Teo", "Le", "leteo@gmail.com");
		
		emp.setAccount(account);
	//	accountDao.save(account);
		
//		employeeDao.save(emp);
//		
//		Employee result = employeeDao.get(1);
//		
//		System.out.println("emp: " + result);
		
//		Account accReult = result.getAccount();
//		System.out.println("acResult: " + accReult);
		
	}
}