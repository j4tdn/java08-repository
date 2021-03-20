package view;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.sharedfk.Account;
import persistence.sharedfk.Employee;

public class DemoFkAssociation {
	private static AccountDao accountDao;
	private static EmployeeDao employeeDao;
	static {
		accountDao = new HibernateAccountDao();
		employeeDao = new HibernateEmployeeDao();

	}

	public static void main(String[] args) {
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//		System.out.println(session);
		Account account = new Account(1, "123-456-789");
		Employee emp = new Employee(1, "lena@gamil.com", "na", "le");
		accountDao.save(account);
		account.setEmployee(emp);
//		
//		emp.setAccount(account);
//		employeeDao.save(emp);
//		Employee employee = employeeDao.get(1);
//		System.out.println(employee);
		//Account acc = employee.getAccount();
		//System.out.println(acc);
	}

}
