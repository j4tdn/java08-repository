package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Employee;

public class HibernateEmployeeDao extends AbstracHibernateDao implements EmployeeDao {

	public void save(Employee employee) {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(employee);
		} catch (Exception e) {
			transaction.rollback();
		}

		transaction.commit();
	}

}
