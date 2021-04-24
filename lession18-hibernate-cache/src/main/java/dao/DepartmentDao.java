package dao;

import java.util.concurrent.TimeUnit;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import persistence.Department;

public class DepartmentDao extends AbstractHibernateDao {
	public Department get(String id) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();

		try {
			Department d1 = session.get(Department.class, id);
			System.out.println("d1:" + d1);

			Department d2 = session.get(Department.class, id);
			System.out.println("d2:" + d2);

			Department d3 = session.get(Department.class, "mgm-munich");
			System.out.println("d3:" + d3);

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return null;
	}

	public Department getIntwoSessions(String id) {
		Session session1 = openSession();
		Department d1 = session1.get(Department.class, id);
		System.out.println("d1:" + d1);

		session1.evict(d1);// xoa d1 ra khoi cache
		// session1.clear();// xoa het du lieu trong cache

		Department d2 = session1.get(Department.class, id);
		System.out.println("d2:" + d2);

		Department d3 = session1.get(Department.class, id);
		System.out.println("d3:" + d3);

		return null;
	}

	public Department getInSecondLevelSessions(String id) {
		System.out.println("================SECOND LEVEL CACHE============");
		Session session1 = openSession();
		Session session2 = openSession();

		Department d1 = session1.get(Department.class, id);
		System.out.println("d1:" + d1);

		sleep(5);

		Department d2 = session2.get(Department.class, id);
		System.out.println("d2:" + d2);

		return null;
	}

	public Department getDepartment(String id) {
		
		Department result = null;
		Session sessison = getCurrentSession();
		Transaction transaction = sessison.beginTransaction();

		try {
			Criteria criatia = sessison.createCriteria(Department.class);
			result = (Department)criatia.add(Restrictions.eq("deptId", id)).uniqueResult();
			System.out.println(result);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return result;
	}

	private void sleep(long seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
