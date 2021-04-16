package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Employee;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao {

	public List<Employee> get(String id) {
		List<Employee> emps = new ArrayList<Employee>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "SELECT * FROM employee WHERE dept_id = :id";

			NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);
			query.setParameter("id", id);

			emps = query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return emps;
	}

	public List<Employee> getAll() {
		List<Employee> emps = new ArrayList<Employee>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "SELECT * FROM employee";

			NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);
			emps = query.getResultList();

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return emps;
	}
}
