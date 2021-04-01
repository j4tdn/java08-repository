package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Employee;


public class EmployeeDao extends AbstractHibernateDao{
	public void save(Employee emp) {
		//	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Session session = utils.HibernateUtil.getSessionFactory().getCurrentSession();
			Transaction transaction = session.beginTransaction();
			try {
				session.save(emp);
			} catch (Exception e) {
				transaction.rollback();
			}
			
			transaction.commit();
		}
}
