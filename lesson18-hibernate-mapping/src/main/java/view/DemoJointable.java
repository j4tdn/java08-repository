package view;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.jointable.Account;
import persistence.jointable.Employee;

public class DemoJointable {

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
		employee.setAccount(account);
		employeeDao.save(employee);
		
	}
}
