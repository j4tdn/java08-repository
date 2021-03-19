package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.jointable.Account;

public class HibernateAccountDao extends AbstractHibernateDao implements AccountDao {

	public void save(Account account) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();

		try {
			System.out.println("state 1: "+session.contains(account));
			session.saveOrUpdate(account);
			
			System.out.println("state 2: "+session.contains(account));
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}
}
