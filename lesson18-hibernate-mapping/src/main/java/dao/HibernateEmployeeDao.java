package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Employee;



public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao{
	public void save( Employee emp) {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(emp);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		
	}
}
