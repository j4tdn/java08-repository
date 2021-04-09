package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Employee;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao {


	public List<Employee> getListEmployee(String id) {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		String sql = "SELECT * FROM employee WHERE dept_id = :deptId";
		List<Employee> emp = new ArrayList<Employee>();
//		try {
			NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);
			
			query.setParameter("deptId", id);
			emp = query.getResultList();
//		}catch (Exception e) {
//			transaction.rollback();
//		}
		transaction.commit();
				
		return emp;
	}

	
}