package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.sharePk.Account;

public class HibernateAccountDao extends AbstractHibernateDao implements AccountDao {


	public void save(Account account) {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();
		try {

			//transient
			System.out.println("state 1 account " + session.contains(account));


			// sau cau lenh nay thi doi tuong account moi la presistence, luc do moi goi session.remove duoc
			session.saveOrUpdate(account);
//			session.evict(account);
			System.out.println("state 2 account " + session.contains(account));

		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();

	}

}
