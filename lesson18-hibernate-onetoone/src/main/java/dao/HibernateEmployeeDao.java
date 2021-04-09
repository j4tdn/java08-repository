package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.sharepk.*;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao{

	@Override
	public void save(Employee employee) {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(employee);
//			session.evict(employee);
//			
//			System.out.println("state 1: " + session.contains(employee));
//			var util = session.getEntityManagerFactory().getPersistenceUnitUtil();
//			
//			System.out.println("state 2: " + util.getIdentifier(employee));
		} catch (Exception e) {
			transaction.rollback();
		}

		transaction.commit();		
	}

	@Override
	public Employee get(Integer id) {
		Session session = getCurrentSession();
		
		Employee emp = null;

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