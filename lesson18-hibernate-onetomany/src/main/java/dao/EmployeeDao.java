package dao;

import java.util.Set;

import org.hibernate.Session;

import persistence.Account;
import persistence.Employee;

public class EmployeeDao extends AbstractHibernateDao {
	public void save(Employee employee) {
		Session session = getCurrentSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(employee);
			
			Employee result = session.get(Employee.class, 1);
			
			Set<Account> accounts = result.getAccounts();
			
			System.out.println(accounts);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();

	}
}
