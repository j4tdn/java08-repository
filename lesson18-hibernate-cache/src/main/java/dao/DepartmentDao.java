package dao;

import java.util.concurrent.TimeUnit;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import persistence.Department;

public class DepartmentDao extends AbstractHibernateDao {
	public Department get(String id) {
		Session session1 =getOpenSession();
		Transaction transaction=session1.beginTransaction();
		try {
			Department d1=session1.get(Department.class, id);
			System.out.println("d1: "+d1);
			
			Department d2=session1.get(Department.class, id);
			System.out.println("d2: "+d2);
			
			Department d3=session1.get(Department.class, id);
			System.out.println("d3: "+d3);
			
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		
		return null;
	}
	public Department getInTwoSessions(String id) {
		Session session1 =getOpenSession();
		//Session session2 =getOpenSession();
		
		Department d1=session1.get(Department.class, id);
		System.out.println("d1"+d1);
		
		//session1.evict(d1);
		
		Department d2=session1.get(Department.class, id);
		System.out.println("d2: "+d2);
		
		session1.clear();
		
		Department d3=session1.get(Department.class, id);
		System.out.println("d3: "+d3);
		
		return null;
	}
	
	public Department getInSecondLevelCache(String id) {
		System.out.println("SECOND LEVEL CACHE: ");
		Session session1 =getOpenSession();
		Session session2 =getOpenSession();
		
		Department d1=session1.get(Department.class, id);
		System.out.println("d1: "+d1);
		
		//session1.evict(d1);
		sleep(5);
		Department d2=session2.get(Department.class, id);
		System.out.println("d2: "+d2);
		
		return null;
	}
 public Department getDepartment(String id) {
	 Department result=null;
	 Session session = getCurrentSession();
	 Transaction transaction=session.beginTransaction();
	 try {
		
		 Criteria criteria= session.createCriteria(Department.class);
		result= (Department)criteria.add(Restrictions.eq("deptId", id))
		 		 .uniqueResult();
		 		 
		 System.out.println("result: "+result);
	} catch (Exception e) {
		// TODO: handle exception
		transaction.rollback();
	}
	 transaction.commit();
	 return result;
 }
	
	public void sleep(long second) {
		try {
			TimeUnit.SECONDS.sleep(second);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
