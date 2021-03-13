package view;

import java.util.List;


import org.hibernate.SessionFactory;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.Account;
import persistence.Employee;
import utils.HibernateUtil;

public class App {
	private static AccountDao accountDao;
	private static EmployeeDao employeeDao;
	
	static {
		accountDao = new HibernateAccountDao();
		employeeDao = new HibernateEmployeeDao();
	}
	
	public static void main(String[] args) {
		Account account = new Account(1, "123-456");
		Employee employee = new Employee(1, "nguyen", "nguyen", "nguyen@gmail.com");
		
		employee.setAccount(account);
		accountDao.save(account);
		employeeDao.save(employee);
		
	}
	
}
