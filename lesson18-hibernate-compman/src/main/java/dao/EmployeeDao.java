package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Department;
import persistence.Employee;

public class EmployeeDao extends AbstractHibernateDao {

	public List<Employee> getEmps(String deptId) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> result = new ArrayList<>();
		try {
			String sql = "SELECT * FROM employee" + "\nWHERE dept_id = :id";
			NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);
			query.setParameter("id", deptId);
			result = query.getResultList();
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		return result;
	}

	public List<Employee> getAll() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> result = new ArrayList<>();
		try {
			String sql = "SELECT * FROM employee";
			NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);
			result = query.getResultList();
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		return result;
	}

}
