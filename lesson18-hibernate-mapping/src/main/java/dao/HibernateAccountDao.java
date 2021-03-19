package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Account;

public class HibernateAccountDao extends AbstractHibernateDao implements AccountDao {

	public void save(Account account) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			//transient
			//System.out.println("state1: " + session.contains(account));
			
			session.saveOrUpdate(account);
		//	session.evict(account); //vao trang thai detach
			
			System.out.println("state1: " + session.contains(account));
			
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}

}
