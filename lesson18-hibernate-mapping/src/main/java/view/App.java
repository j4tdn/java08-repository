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
		Account account = new Account(123, "123-685-471");
		Employee employee = new Employee(1, "Teo", "Le", "leteo@gmail.com");
		
		employee.setAccount(account);
		
		employeeDao.save(employee);
	}
}