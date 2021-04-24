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
			System.out.println(d1);

			Department d2 = session.get(Department.class, id);
			System.out.println(d2);

			Department d3 = session.get(Department.class, "mgm-mu");
			System.out.println(d3);

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public Department getById(String id) {
		Department department = null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			Criteria criteria = session.createCriteria(Department.class);
			department = (Department) criteria.add(Restrictions.eq("deptId", id)).uniqueResult();

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return department;
	}

	public Department getInTwoSession(String id) {
		Session session1 = openSession();
//		Session session2 = openSession();
		Transaction transaction = session1.beginTransaction();
		try {
			Department d1 = session1.get(Department.class, id);
			System.out.println("d1: " + d1);

			// session1.evict(d1);

			Department d2 = session1.get(Department.class, id);
			System.out.println("d2: " + d2);

			session1.clear();

			Department d3 = session1.get(Department.class, id);
			System.out.println("d3: " + d3);

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return null;
	}

	public Department getInSecondLevelCache(String id) {

		System.out.println("\n=========>SECOND LEVEL CACHE<=========\n");

		Session session1 = openSession();
		Session session2 = openSession();
		Department d1 = session1.get(Department.class, id);
		System.out.println("d1: " + d1);

//		try {
//			TimeUnit.SECONDS.sleep(4);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		Department d2 = session2.get(Department.class, id);
		System.out.println("d2: " + d2);

		return null;
	}
}
