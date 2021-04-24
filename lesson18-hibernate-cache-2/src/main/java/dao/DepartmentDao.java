package dao;

import java.util.concurrent.TimeUnit;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import persistence.Department;

public class DepartmentDao extends AbstractHibernateDao {
	public Department get(String id) {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			Department d1 = session.get(Department.class, id);
			System.out.println("d1: " + d1);
			
			Department d2 = session.get(Department.class, id);
			System.out.println("d2: " + d2);
			
			Department d3 = session.get(Department.class, "mgm-mu");
			System.out.println("d3: " + d3);
			
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		
		Session session2 = getCurreSession();				
		Transaction transaction2 = session2.beginTransaction();
		
		try {
			Department d1 = session2.get(Department.class, id);
			System.out.println("d1: " + d1);			
			
			transaction2.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		
		return null;
	}
	
	public Department getInTwoSessions(String id) {
//		Session session1 = getCurreSession();
//		Session session2 = getCurreSession();
//		
//		Transaction transaction = session1.beginTransaction();
//		
//		try {
//			Department d1 = session1.get(Department.class, id);
//			System.out.println("d1: " + d1);
//			
//			Department d2 = session2.get(Department.class, id);
//			System.out.println("d2: " + d2);
//			
//			transaction.commit();
//		} catch (Exception e) {
//			transaction.rollback();
//		}
		
		Session session1 = openSession();
		Session session2 = openSession();
		
		Department d1 = session1.get(Department.class, id);
		System.out.println("d1: " + d1);		
//		session1.evict(d1); // xoa cache cho 1 entity
		
		Department d2 = session1.get(Department.class, id);
		System.out.println("d2: " + d2);
		
		session1.clear(); // xoa cache cho tat ca entity theo id
		Department d3 = session1.get(Department.class, id);
		System.out.println("d3: " + d3);
		
		return null;
	}
	
	public Department getInSecondLevelCache(String id) {
		System.out.println("========SECOND LEVEL CACHE==========");
		
		Session session1 = openSession();
		Session session2 = openSession();
		
		Department d1 = session1.get(Department.class, id);
		System.out.println("d1: " + d1);		
		
		sleep(5);
		
		Department d2 = session2.get(Department.class, id);
		System.out.println("d2: " + d2);
		
		return null;
	}
	
	public Department getDepartment(String id) {
		Department result;
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			Criteria criteria = session.createCriteria(Department.class);
			result = (Department) criteria.add(Restrictions.eq("deptId", id))
					.uniqueResult();
			
			transaction.commit();
			return result;
		} catch (Exception e) {
			transaction.rollback();
		}
		
		return null;
		
	}
	
	private void sleep(long seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
