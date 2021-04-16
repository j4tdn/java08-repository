package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Employee;
import utils.hibernateUtil;

public class EmployeeDao {
	Session session = hibernateUtil.getSessionFactory().getCurrentSession();
	public List<Employee> getAllEmployeeByDepartmentId(String id) {
		Transaction transaction = session.beginTransaction();
		String query = "SELECT * FROM employee WHERE dept_id = ?";
		NativeQuery<Employee> nativeQuery = session.createNativeQuery(query, Employee.class);
		nativeQuery.setParameter(1, id);
		List<Employee> listEmployees = nativeQuery.getResultList();
		transaction.commit();
		return listEmployees;
	}
	
	public List<Employee> getAllEmployee() { 
		Transaction transaction = session.beginTransaction();
		String query = "SELECT * "
				+ " FROM employee"
				+ " GROUP BY dept_id, emp_id";
		NativeQuery<Employee> nativeQuery = session.createNativeQuery(query, Employee.class);
		List<Employee> employees = nativeQuery.getResultList();
		transaction.commit();
		return employees;
	}
}
