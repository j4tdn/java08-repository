package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.fkassociation.Account;

//import persistence.fkassociation.Account;
//import persistence.fkassociation.Employee;

public class AccountHibernate extends AbstractHibernateDao implements AccountDao {

	public void save(Account account) {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		try {
			// transient
			// System.out.println("state: " + session.contains(account));
			
			session.saveOrUpdate(account);
			//session.evict(account);
			session.flush();
			
			// System.out.println("state: " + session.contains(account));
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		
	}

	public void save(persistence.jointable.Account account) {
		// TODO Auto-generated method stub
		
	}
}
