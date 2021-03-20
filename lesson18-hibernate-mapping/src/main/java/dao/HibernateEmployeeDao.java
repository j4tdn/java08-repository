package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.sharePk.Employee;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao{


	public void save(Employee employee) {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();

		try {
			System.out.println("state 1 employee" + session.contains(employee));

			session.saveOrUpdate(employee);

			// lam cho vao detached
//			session.evict(employee);

//			PersistenceUnitUtil persistenceUnitUtil = (PersistenceUnitUtil) session.getIdentifier(employee);
//			System.out.println("");

			System.out.println("state 2 employee" + session.contains(employee));
		} catch (Exception e) {

			transaction.rollback();
		}

		transaction.commit();		
	}

	public Employee get(Integer id) {

		Employee emp = null ;


		 Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();

		try {
			emp = session.get(Employee.class,id);

		} catch (Exception e) {
			transaction.rollback();
		}

		transaction.commit();

		return emp ;
	}

}
