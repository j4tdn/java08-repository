package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.jointable.Account;

public class HibernateAccountDao extends AbstracHibernateDao implements AccountDao{

	public void save(Account account) {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();
		try {
			//transient
//			System.out.println("state !: "+ session.contains(account));
			session.saveOrUpdate(account);
//			System.out.println("state !: "+ session.contains(account));
		} catch (Exception e) {
			transaction.rollback();
		}

		transaction.commit();
	}

}
