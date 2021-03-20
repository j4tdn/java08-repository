package view;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.jointable.Account;
import persistence.jointable.Employee;

public class DemoJoinTable {
	private static AccountDao accountDao;
	private static EmployeeDao employeeDao;

	static {
		accountDao = new HibernateAccountDao();
		employeeDao = new HibernateEmployeeDao();
	}

	public static void main(String[] args) {
		Account account = new Account(123, "123-685-471");
		Employee emp = new Employee(1, "Teo", "Le", "leteo@gmail.com");
		
//		accountDao.save(account);
		emp.setAccount(account);
	//	employeeDao.save(emp);
	}
}