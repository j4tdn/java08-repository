package dao;

import org.hibernate.Session;

import persistence.Employee;

public class EmployeeDao extends AbstractHibernateDao {
	public void save(Employee employee) {
		Session session = getCurrentSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		try {
			System.out.println("====");
			session.saveOrUpdate(employee);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();

	}
}
