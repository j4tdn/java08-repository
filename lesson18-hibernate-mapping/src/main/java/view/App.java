package view;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.Account;
import persistence.Employee;

public class App {

	private static AccountDao accountDao;
	private static EmployeeDao employeeDao;

	static {
		accountDao = new HibernateAccountDao();
		employeeDao = new HibernateEmployeeDao();
	}

	public static void main(String[] args) {
		Account account = new Account(1, "123-132-134");
		Employee employee = new Employee(1, "lam@gmail.com", "lamquan", "tran", account);
		
		accountDao.save(account);
		employeeDao.save(employee);
	}
}
