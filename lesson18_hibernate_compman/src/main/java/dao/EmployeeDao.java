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
	public List<Employee> getEmps(String empid) {
		SessionFactory sessionFa = HibernateUtil.getSessionFactory();
		Session session = sessionFa.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> result = new ArrayList<>();
		try {
			String sql = "SELECT * FROM Employee" + "\n WHERE dept_id = :id";
			NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);
			query.setParameter("id", empid);
			result = query.getResultList();

		} catch (Exception e) {
		}
		transaction.commit();
		return result;
	}
	
	public List<Employee> getEmps2 (String deptid) {
		SessionFactory sessionFa = HibernateUtil.getSessionFactory();
		Session session = sessionFa.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> result = new ArrayList<>();
		try {
			String sql =  "select * from employee emp join department der on der.dept_id = emp.dept_id";
			NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);
			//query.setParameter("id", deptid);
			result = query.getResultList();

		} catch (Exception e) {
		}
		transaction.commit();
		return result;
	}
}
