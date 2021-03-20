package view;

import dao.AccountDao;
import dao.EmployeeDao;
import persistence.Account;
import persistence.Employee;

public class Demo {

	private static EmployeeDao employeeDao;
	private static AccountDao accountDao;
	static {
		accountDao = new AccountDao();
		employeeDao = new EmployeeDao();

	}

	public static void main(String[] args) {
		Employee emp = new Employee(1, "lena@gamil.com", "na", "le");
		Account account1 = new Account(1, "123-456-789");
		Account account2 = new Account(2, "123-456-789");
		accountDao.save(account1);
		accountDao.save(account2);
//		employeeDao.save(emp);
//		emp.getAccounts().add(account1);
//		emp.getAccounts().add(account2);

		// account.setEmployee(emp);
	}

}
