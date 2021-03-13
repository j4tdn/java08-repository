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
		Account account = new Account(1, "123-456-789");
		accountDao.save(account);

		Employee employee = new Employee(1, "hau", "bui", "hauviptt@gmail.com", account);
		employeeDao.save(employee);

	}
}
