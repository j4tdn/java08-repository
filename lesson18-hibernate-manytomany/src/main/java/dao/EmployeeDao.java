package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import persistence.Employee;

public class EmployeeDao extends AbstractHibernateDao {

	public void save(Employee emp) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			System.out.println("===");
			session.save(emp);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}

	public Employee get(Integer id) {
		Employee emp = null;
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
