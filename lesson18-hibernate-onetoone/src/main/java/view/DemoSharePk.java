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
//		Account account = new Account(1,  "123-456-789");
		Employee emp = new Employee(1, "Teo", "Le", "leteo@gmail.com");
		
//		emp.setAccount(account);
//		account.setEmployee(emp);
		
//		accountDao.save(account);
		employeeDao.save(emp);
		
		Employee result = employeeDao.get(1);
		System.out.println(result.getId());
		System.out.println(result.getEmail());
		System.out.println(result.getFirstName() + " " + result.getLastName());
		System.out.println(result.getAccount());
	}
}
