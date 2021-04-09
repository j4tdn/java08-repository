package view;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.sharepk.*;

public class DemoSharePk {
	private static AccountDao accountDao;
	private static EmployeeDao employeeDao;
	
	static {
		accountDao = new HibernateAccountDao();
		employeeDao = new HibernateEmployeeDao();
	}

	public static void main(String[] args) {		
		Account account = new Account(123, "123-456-789");
		Employee employee = new Employee(1, "Le", "Na", "le_teo@gmail.com");
		
		employee.setAccount(account);
		account.setEmployee(employee);
		
		employeeDao.save(employee);
		accountDao.save(account);

		var em = employeeDao.get(1);
		System.out.println(em);
		
		System.out.println(em.getAccount());
		


	}

}