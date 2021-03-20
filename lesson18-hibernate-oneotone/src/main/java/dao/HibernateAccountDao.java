package dao;

import org.hibernate.Session;


import org.hibernate.Transaction;

import persistence.sharepk.Account;

public class HibernateAccountDao extends AbstractHibernateDao implements AccountDao {

	public void save(Account account) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();

		try {
			//transient
			// System.out.println("state 1 " + session.contains(account));
			
			session.saveOrUpdate(account);
			// session.evict(account);
			
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}

	
}
