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
		Account account = new Account(1, "123-132-134");
		Employee employees = new Employee(1, "lam@gmail.com", "lamquan", "tran", account);
//		
//		accountDao.save(account);
//		employeeDao.save(employees);
//		
//		Employee result = employeeDao.get(1);
//		System.out.println(result);
		
	}
}
