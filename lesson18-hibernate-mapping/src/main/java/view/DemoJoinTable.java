package view;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.fkassociation.Account;
import persistence.fkassociation.Employee;
import util.HibernateUtil;

public class DemoJoinTable {
	private static AccountDao accountDao;
	private static EmployeeDao employeetDao;

	static {
		accountDao = new HibernateAccountDao();
		employeetDao = new HibernateEmployeeDao();
	}

	public static void main(String[] args) {

		Account account = new Account(123, "123-456-789");
		Employee employee = new Employee(1, "Teo", "Le", "leteo@gmail.com");
		employee.setAccount(account);
		//accountDao.save(account);
		employeetDao.save(employee);

		
	
	}
}