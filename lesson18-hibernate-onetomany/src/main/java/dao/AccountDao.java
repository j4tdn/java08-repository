package dao;

import org.hibernate.Session;

import persistence.Account;

public class AccountDao extends AbstractHibernateDao {
	public void save(Account acc) {
		Session session = getCurrentSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(acc);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();

	}
}
