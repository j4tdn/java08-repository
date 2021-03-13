package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateEmployeeDao implements EmployeeDao{

	public void save(Employee emplyee) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(student);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}

}
