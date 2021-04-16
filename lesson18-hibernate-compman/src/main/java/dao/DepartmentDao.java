package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Department;
import utils.hibernateUtil;

public class DepartmentDao {
	Session session = hibernateUtil.getSessionFactory().getCurrentSession();
	public List<Department> getAllEmployeeByDepartment() {
		Transaction transaction = session.beginTransaction();
		String query = "SELECT * FROM department ";
		NativeQuery<Department> nativeQuery = session.createNativeQuery(query, Department.class);
		List<Department> department = nativeQuery.getResultList();
		for (Department d : department) {
			System.out.println(d.getEmployees());
			System.out.println("----------------");
			System.out.println(d.getProjects());
		}
		transaction.commit();
		return department;
	}
	
	public List<Department> getProjectInDepartment() {
		Transaction transaction = session.beginTransaction();
		String query = "SELECT * FROM department";
		NativeQuery<Department> nativeQuery = session.createNativeQuery(query, Department.class);
		List<Department> departments = nativeQuery.getResultList();
		for (Department d : departments) {
			System.out.println(d.getProjects());
		}
		transaction.commit();
		return departments;
	}
}
