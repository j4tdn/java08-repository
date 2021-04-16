package dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Account;
import persistence.Employee;
import utils.hibernateUtil;

public class EmployeeDao extends AbstracHibernateDao {
	public void save(Employee employee) {
		Session session =  hibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		try {
			session.save(employee);
//			Employee result = session.get(Employee.class, 1);
//			Set<Account> accounts = result.getAccounts();
//			System.out.println(accounts);
		} catch (Exception e) {
			transaction.rollback();
		}
		
		transaction.commit();
	}
}
