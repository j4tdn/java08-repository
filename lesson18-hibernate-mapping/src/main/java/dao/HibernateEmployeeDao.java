package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.jointable.Employee;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao {

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

	public Employee get(Integer id) {
		Employee emp =null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();

		try {
			emp = session.get(Employee.class, id);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		return emp;
	}
}
