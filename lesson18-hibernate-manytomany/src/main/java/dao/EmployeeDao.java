package dao;

import org.hibernate.Transaction;

import persistence.Employee;
import utils.HibernateUtils;


public class EmployeeDao extends AbstractHibernateDao{
	public void save(Employee employee) {
		var session = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();

		try {
			session.saveOrUpdate(employee);
			
		} catch (Exception e) {
			transaction.rollback();
		}
		
		transaction.commit();
	}
}