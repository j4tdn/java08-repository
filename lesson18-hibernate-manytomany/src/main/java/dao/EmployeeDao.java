package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Employee;
import utils.HibernateUtil;

public class EmployeeDao extends AbstractHibernateDao{
	public void save(Employee emp) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(emp);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}
}
