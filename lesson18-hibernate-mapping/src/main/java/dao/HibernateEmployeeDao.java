package dao;

import javax.persistence.PersistenceUnitUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.jointable.Account;
import persistence.jointable.Employee;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao {

	@Override
	public void save(Employee employee) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(employee);
//			session.evict(employee);
//			System.out.println("state 1: " + session.contains(employee));
//			PersistenceUnitUtil util = session.getEntityManagerFactory().getPersistenceUnitUtil();
//			System.out.println("state 2: " + util.getIdentifier(employee));
			Account accResult = employee.getAccount();
			System.out.println(accResult);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}

	@Override
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
