package dao;


import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Account;
import persistence.Employee;

public class EmployeeDao extends AbstractHibernateDao{
	public void save(Employee emp) {
	//	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Session session = utils.HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(emp);
			
			Employee result = session.get(Employee.class, 12);
			Set<Account> accounts = result.getAccounts();
			System.out.println(accounts);
			
		} catch (Exception e) {
			transaction.rollback();
		}
		
		transaction.commit();
	}
}