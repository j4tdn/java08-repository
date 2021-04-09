package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Employee;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao {

	public void save(Employee employee) {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(employee);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}

	public Employee get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}