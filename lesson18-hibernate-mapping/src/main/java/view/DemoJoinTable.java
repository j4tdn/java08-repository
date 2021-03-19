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
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//		System.out.println(session);
		Account account = new Account(2, "123-456-789");
		Employee emp = new Employee(1, "lena@gamil.com", "na", "le");
		accountDao.save(account);
//		
		emp.setAccount(account);
		employeeDao.save(emp);
//		Employee employee = employeeDao.get(1);
//		System.out.println(employee);
		//Account acc = employee.getAccount();
		//System.out.println(acc);
	}

}
