package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Account;
import persistence.Employee;

public class HibernateAccountDao extends AbstractHibernateDao implements AccountDao {
	public void save(Account acc) {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(acc);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		
	}

	
}
