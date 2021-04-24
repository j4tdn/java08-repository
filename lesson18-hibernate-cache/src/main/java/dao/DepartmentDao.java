package dao;

import java.util.concurrent.TimeUnit;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import persistence.Department;

public class DepartmentDao extends AbstracHibernateDao {

	public Department get(String id) {
//		Session session = getCurrentSession().beginTransaction();
		// Để biết được bắt đầu với transaction nào trong current Session
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();

		try {
			Department d1 = session.get(Department.class, id);
			System.out.println("d1 :" + d1);

			Department d2 = session.get(Department.class, id);
			System.out.println("d2 :" + d2);

			Department d3 = session.get(Department.class, "mgm-mu");
			System.out.println("d3 :" + d3);

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return null;
	}

	public Department getInTwoSession(String id) {
		Session session1 = openSession();
		Session session2 = openSession();

		Department d1 = session1.get(Department.class, id);
		System.out.println("d1 :" + d1);

		Department d2 = session1.get(Department.class, id);
		System.out.println("d2 :" + d2);
		session1.clear();

		Department d3 = session1.get(Department.class, id);
		System.out.println("d2 :" + d3);

		return null;
	}

	public Department getInSecondLevelCache(String id) {
		System.out.println("=== SECOND LEVEL CACHE ===");
		Session session1 = openSession();
		Session session2 = openSession();

		Department d1 = session1.get(Department.class, id);
		System.out.println("d1 :" + d1);

		sleep(5l);

		Department d2 = session2.get(Department.class, id);
		System.out.println("d2 :" + d2);
		return null;
	}

	public void sleep(Long i) {
		try {
			TimeUnit.SECONDS.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Department getDepartment(String id) {
		Session session = getCurrentSession();
		Department result = null;
		Transaction transaction = session.beginTransaction();
		try {

			Criteria cri = session.createCriteria(Department.class);
			result = (Department) cri.add(Restrictions.eq("departmentId", id)).uniqueResult();

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return result;
	}
}
