package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Employee;
import utils.hibernateUtil;

public class EmployeeDao extends AbstracHibernateDao {
	public void save(Employee employee) {
		Session session =  hibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			session.save(employee);

		} catch (Exception e) {
			transaction.rollback();
		}
		
		transaction.commit();
	}
}
