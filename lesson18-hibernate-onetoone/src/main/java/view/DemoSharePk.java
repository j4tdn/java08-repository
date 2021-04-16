package view;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.sharepk.Account;
import persistence.sharepk.Employee;

public class DemoSharePk {

	private static AccountDao accountDao;
	private static EmployeeDao employeeDao;

	static {
		accountDao = new HibernateAccountDao();
		employeeDao = new HibernateEmployeeDao();
	}

	public static void main(String[] args) {
	
		Employee employees = new Employee(1, "lam@gmail.com", "lamquan", "tran");
//		account.setEmployee(employees);
//		accountDao.save(account);
		employeeDao.save(employees);
		
		Employee result = employeeDao.get(1);
		System.out.println(result);
		
		System.out.println(result.getAccount());
//		
//		Employee result = employeeDao.get(1);
//		System.out.println(result);
		
	}
}
