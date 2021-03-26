package view;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import dao.AccountDao;
import dao.AccountHibernate;
import dao.EmployeeDao;
import dao.EmployeeHibernate;
import persistence.fkassociation.Account;
import persistence.fkassociation.Employee;
import utils.HibernateUtil;

public class DemoFkAssociation {
	private static AccountDao accountDao;
	private static EmployeeDao employeeDao;
	
	static {
		accountDao = new AccountHibernate();
		employeeDao = new EmployeeHibernate();
	}
	
	public static void DemoFkAssociation(String[] args) {
		 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
//		Account account = new Account(123, "123-456-789");
//		Employee emp = new Employee(1, "Le", "Na", "lena@gmail.com");
//		emp.setAccount(account);
//		accountDao.save(account);
//		
//		employeeDao.save(emp);
//		
//		Employee employee = employeeDao.get(1);
//		System.out.println(employee);
//		
//		Account accResult = employee.getAccount();
//		System.out.println(accResult);
	}

}