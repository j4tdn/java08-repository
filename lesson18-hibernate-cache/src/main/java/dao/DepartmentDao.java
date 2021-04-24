package dao;

import java.util.concurrent.TimeUnit;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import persistence.Department;

public class DepartmentDao extends AbstractHibernateDao {
	public Department get(String id) {
		var session = getCurrentSession();

		Transaction transaction = session.beginTransaction();

		try {
			var d1 = session.get(Department.class, id);
			System.out.println("d1: " + d1);
			var d2 = session.get(Department.class, id);
			System.out.println("d2: " + d2);

			var d3 = session.get(Department.class, "mgm-mu");
			System.out.println("d3: " + d3);

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		return null;
	}

	public Department getInTwoSession(String id) {
		var session1 = openSession();
		var session2 = openSession();

		var d1 = session1.get(Department.class, id);
		System.out.println("d1: " + d1);
		//session1.evict(d1);
		var d2 = session2.get(Department.class, id);
		System.out.println("d2: " + d2);
		session1.clear();
		
		var d3 = session1.get(Department.class, id);
		System.out.println("d3: " + d3);
		return null;
	}
	
	public Department getInSecondLevelCache(String id) {
		var session1 = openSession();
		var session2 = openSession();

		var d1 = session1.get(Department.class, id);
		System.out.println("d1: " + d1);
		sleep(5);
		var d2 = session2.get(Department.class, id);
		System.out.println("d2: " + d2);
		
		return null;
		
	}

	public Department getDepartment(String id) {
		Session session = getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		var criteria = session.createCriteria(Department.class);
		
		var department = (Department) criteria.add(Restrictions.eq("id", id))
			.uniqueResult();
		
		transaction.commit();
		
		return department;
	}
	
	private void sleep (long seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
