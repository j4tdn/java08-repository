package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Employee;
import utils.HibernateUtils;

public class EmployeeDao {
	public List<Employee> getEmps(String deptId) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		Transaction transaction = session.beginTransaction();

		List<Employee> result = new ArrayList<Employee>();
		try {
			String sql = "SELECT * FROM employee" + "\nWHERE dept_id = :id";
			NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);

			query.setParameter("id", deptId);
			result = query.getResultList();

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return result;
	}
	public List<Employee> getEmp() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		Transaction transaction = session.beginTransaction();

		List<Employee> result = new ArrayList<Employee>();
		try {
			String sql = "SELECT * FROM employee e join department d \n" + 
					" on e.dept_id=d.dept_id ";
			NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);

			
			result = query.getResultList();

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return result;
	}
}