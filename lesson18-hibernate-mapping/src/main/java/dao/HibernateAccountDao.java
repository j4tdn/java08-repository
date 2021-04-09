package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Account;

public class HibernateAccountDao extends AbstractHibernateDao implements AccountDao {

	public void save(Account account) {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(account);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}

}
