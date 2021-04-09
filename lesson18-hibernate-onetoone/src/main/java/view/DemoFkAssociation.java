package view;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.fkassociation.Account;
import persistence.fkassociation.Employee;

public class DemoFkAssociation {
	private static AccountDao accountDao;
	private static EmployeeDao employeeDao;
	
	static {
		accountDao = new HibernateAccountDao();
		employeeDao = new HibernateEmployeeDao();
	}

	public static void main(String[] args) {		
		Account account = new Account(123, "123-456-789");
		Employee employee = new Employee(1, "Le", "Na", "le_teo@gmail.com");
		
//		accountDao.save(account);
//		
//		employee.setAccount(account);
//
//		employeeDao.save(employee);
		
//		var result = employeeDao.get(1);
//
//		System.out.println("ACACCAC" + result);
//		
//		Account accresult = result.getAccount();
//		
//		System.out.println(accresult);
	}

}