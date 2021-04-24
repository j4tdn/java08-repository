package dao;

import java.util.List;

import org.hibernate.Transaction;

import persistence.Employee;

public class EmployeeDao extends AbstractHibernateDao {
	public List<Employee> getAllByDepartmentId(String departmentId) {
		List<Employee> employees = null;

		Transaction transaction = getCurrentSession().beginTransaction();

		var query = getCurrentSession().createNativeQuery("SELECT * FROM Employee  Where dept_id = :id",
				Employee.class);

		query.setParameter("id", departmentId);
		employees = query.getResultList();

		transaction.commit();
		return employees;
	}

}
