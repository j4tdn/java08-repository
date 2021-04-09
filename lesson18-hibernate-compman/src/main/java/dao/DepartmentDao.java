package dao;

import java.util.List;

import org.hibernate.Transaction;

import persistence.Department;
import persistence.Employee;

public class DepartmentDao extends AbstractHibernateDao {
	public List<Department> getAll(){
		List<Department> departments = null;

		Transaction transaction = getCurrentSession().beginTransaction();

		var query = getCurrentSession().createNativeQuery("SELECT * FROM DEPARTMENT",
				Department.class);

		departments = query.getResultList();

		transaction.commit();
		return departments;
	}
}
