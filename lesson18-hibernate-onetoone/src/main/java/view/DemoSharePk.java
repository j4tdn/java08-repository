package view;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.sharepk.Employee;

public class DemoSharePk {

	private static AccountDao accountDao;
	private static EmployeeDao employeeDao;

	static {
		accountDao = new HibernateAccountDao();
		employeeDao = new HibernateEmployeeDao();
	}

	public static void main(String[] args) {
		Employee employee = new Employee(1, "hau", "bui", "hauviptt@gmail.com");
		employeeDao.save(employee);
		
		Employee result = employeeDao.get(1);
		System.out.println(result.getId());
		System.out.println(result.getEmail());
		System.out.println(result.getFirstName()+" "+ result.getLastName());
		System.out.println(result.getAccount().getAccountNumber());
	}
}
