package dao;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.criterion.Restrictions;
import persistence.Department;
import persistence.Employee;

public class DepartmentDao extends AbstractHibernateDao {
	public Department get(String id){
		List<Department> departments = null;

		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();

		try {

			//session . get => lay truc tiep du lieu
			// session . load => lay ve mot proxy


			Department d1 = session.get(Department.class,id);

			System.out.println("d1"+d1);

			Department d2 = session.get(Department.class,id);

			System.out.println("d2"+d2);

			Department d3 = session.get(Department.class,"mgm-mu");

			System.out.println("d3"+d3);

			transaction.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}


		return null;
	}

	public Department getInTwoSessions(String id){
		Session session1 = getCurrentSession();
		Session session2 = getCurrentSession();

		Transaction transaction = session1.beginTransaction();

		try {
			Department d1 = session1.get(Department.class,id);

			// xoa doi tuong d1 khoi session cache
			session1.evict(d1);

			Department d2 = session2.get(Department.class,id);

			// xoa het tat ca session cache trong persistence context
			session1.clear();

			System.out.println("d1" + d1);
			System.out.println("d2" + d2);

			transaction.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			transaction.rollback();
		}

		return null ;
	}
	public Department getInTwoSessionsByOpenSession(String id){
		Session session1 = openSession();
		Session session2 = openSession();

		Transaction transaction = session1.beginTransaction();

		try {
			Department d1 = session1.get(Department.class,id);

			Department d2 = session2.get(Department.class,id);

			System.out.println("d1" + d1);
			System.out.println("d2" + d2);

			transaction.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			transaction.rollback();
		}

		return null ;
	}

	public Department getInSecondsLevelCache(String id){
		System.out.println("======= SECOND LEVEL CACHE =======");
		Session session1 = openSession();
		Session session2 = openSession();


			Department d1 = session1.get(Department.class,id);


		//sleep(5);

			Department d2 = session2.get(Department.class,id);

			System.out.println("d1" + d1);
			System.out.println("d2" + d2);



		return null ;
	}

	public Department getDepartmentByCriteriaQuery(String id){

		Department result = null ;

		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();

		try {

			Criteria criteria = session.createCriteria(Department.class);
			result = (Department) criteria.add(Restrictions.eq("id",id)).uniqueResult();

			transaction.commit();

		}
		catch(Exception e){
			e.printStackTrace();
			transaction.rollback();
		}
		return result;
	}






	private static void sleep(int seconds){
		try {
			TimeUnit.SECONDS.sleep(seconds);
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}


}
