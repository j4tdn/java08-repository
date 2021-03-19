package dao;

import javax.persistence.PersistenceUnitUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.jointable.Account;
import persistence.jointable.Employee;

public class HibernateEmployeeDao extends AbstracHibernateDao implements EmployeeDao {

	public void save(Employee employee) {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(employee);
//			session.evict(employee);
			System.out.println("state contain e: " + session.contains(employee));
			
			
			PersistenceUnitUtil unit = session.getEntityManagerFactory().getPersistenceUnitUtil();
			System.out.println("state  e: " +  unit.getIdentifier(employee));
		} catch (Exception e) {
			transaction.rollback();
		}

		transaction.commit();
	}

	public Employee get(Integer i) {
		Session session = getCurrentSession();
		Employee employee = null;

		Transaction transaction = session.beginTransaction();
		try {
			 employee = session.get(Employee.class, i);
			 Account account2 = employee.getAccount();
				System.out.println(account2);
			
		} catch (Exception e) {
			transaction.rollback();
		}

		transaction.commit();
		return employee;
	}

}
