package dao;

import javax.persistence.PersistenceUnitUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.jointable.Employee;

//import persistence.fkassociation.Employee;

public class EmployeeHibernate extends AbstractHibernateDao implements EmployeeDao {

	public void save(Employee employee) {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(employee);
			session.evict(employee);
			System.out.println("state 1: " + session.contains(employee));
			PersistenceUnitUtil util = session.getEntityManagerFactory().getPersistenceUnitUtil();
			System.out.println("state 2: " + util.getIdentifier(employee));
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		
	}
	
	public Employee get(Integer id) {
		Employee emp = null;
		Session session = getCurreSession();
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
