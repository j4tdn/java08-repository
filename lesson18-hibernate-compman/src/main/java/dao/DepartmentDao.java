package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Department;

public class DepartmentDao extends AbstractHibernateDao {

	public List<Department> getAll() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Department> result = new ArrayList<>();
		try {
			String sql = "SELECT * FROM department";
			NativeQuery<Department> query = session.createNativeQuery(sql, Department.class);
			result = query.getResultList();
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		return result;
	}

}
