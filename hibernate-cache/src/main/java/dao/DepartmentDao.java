package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import persistence.Department;
import utils.HibernateUtil;

public class DepartmentDao extends AbstractHibernateDao {
	public Department get(String id) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();

		try {
			Department d1 = session.get(Department.class, id);
			System.out.println("d1 " + d1);

			Department d2 = session.get(Department.class, id);
			System.out.println("d2 " + d2);

			Department d3 = session.get(Department.class, "mgm-by");
			System.out.println("d3 " + d3);

		} catch (Exception e) {
			transaction.rollback();
		}
		session.close();
		return null;
	}

	public Department getTwoSessions(String id) {
		Session session1 = getCurrentSession();
		Session session2 = getCurrentSession();

		Transaction transaction = session1.beginTransaction();

		try {
			Department d1 = session1.get(Department.class, id);
			System.out.println("d1 " + d1);

			session1.evict(d1);

			Department d2 = session1.get(Department.class, id);
			System.out.println("d2 " + d2);
			session1.evict(d2);

			Department d3 = session1.get(Department.class, "mgm-by");
			System.out.println("d3 " + d3);

			Department d4 = session2.get(Department.class, id);
			System.out.println("d4: " + d4);
		} catch (Exception e) {
			transaction.rollback();
		}
		session1.close();
		return null;
	}

	public Department getSecondLevelCache(String id) {
		Session session1 = openSession();
		Session session2 = openSession();

		Department d1 = session1.get(Department.class, id);
		System.out.println("d1 " + d1);
		
		Department d2 = session2.get(Department.class, id);
		System.out.println("d2 " + d2);
		
		Department dx = session1.get(Department.class, "mgm-by");
		System.out.println("dx: " + dx);
		
		Department dy = session1.get(Department.class, "mgm-by");
		System.out.println("dy: " + dy);
		
		return null;
	}
	
	public Department queryCache(String id) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		// HQL
		String sql = "SELECT d FROM department d WHERE d.deptId = :id";
		try {
			Query<Department> query = session.createQuery(sql, Department.class);
		    query.setCacheable(true);
		    Department d1 = query.setParameter("id", "mgm-dn").uniqueResult();
		    query.setCacheRegion(Department.class.getCanonicalName());	
		    System.out.println("d1: " + d1 );
		 
		    Department d2 = query.setParameter("id", "mgm-mu").uniqueResult();
		    System.out.println("d2: " + d2);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		
		return null;
	}

}
