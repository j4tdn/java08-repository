package dao;

import java.util.concurrent.TimeUnit;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.sun.xml.bind.v2.runtime.RuntimeUtil;

import persistence.Department;

public class DepartmentDao extends AbstractHibernateDao {
	public DepartmentDao() {
		// TODO Auto-generated constructor stub
	}

	public Department get(String id) {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();

		try {
			Department d1 = session.get(Department.class, id);
			System.out.println("d1: " + d1);
			Department d2 = session.get(Department.class, id);
			System.out.println("d2: " + d2);

			Department d3 = session.get(Department.class, id);
			System.out.println("d3: " + d3);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return null;
	}

	
	public Department getInTwoSessions(String id) {
		Session session1 = openSession();
		

		Department d1 = session1.get(Department.class, id);
		System.out.println("d1: " + d1);
		
		Department d2 = session1.get(Department.class, id);
		System.out.println("d2: " + d2);
		
		session1.clear();
		Department d3 = session1.get(Department.class, id);
		System.out.println("d2: " + d3);

		return null;
	}
	
	public Department getInSecondLevelCache(String id) {
		Session session1 = openSession();
		Session session2 = openSession();

		Department d1 = session1.get(Department.class, id);
		System.out.println("d1: " + d1);
		sleep(10000);
	

		Department d2 = session2.get(Department.class, id);
		System.out.println("d2: " + d2);

		return null;
	}
	public Department getDepartment(String id) {
		Department result = null;
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		try {
		Criteria criteria =  session.createCriteria(Department.class);
			result = (Department) criteria.add(Restrictions.eq("dept_id", id));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
	
	private void sleep(long seconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(seconds);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
