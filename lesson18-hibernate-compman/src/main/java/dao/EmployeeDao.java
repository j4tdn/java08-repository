package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Employee;
import utils.HibernateUtil;

public class EmployeeDao {
	public List<Employee> getEmps(String deptId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> result = new ArrayList<>();
		try {
			String sql = "SELECT * FROM employee"
					+ "\nWHERE dept_id = :id";
			NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);
			query.setParameter("id", deptId);
			result = query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		System.out.println("size: " + result.size());
		return result;
	}
	
}
