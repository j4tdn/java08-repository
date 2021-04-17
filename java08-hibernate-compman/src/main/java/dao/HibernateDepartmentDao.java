package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Department;

public class HibernateDepartmentDao extends AbstractHibernateDao implements DepartmentDao{

	public List<Department> dept() {
		Session session = getCurreSession();
		Transaction transaction =session.beginTransaction();
		
		String sql = "SELECT * FROM department";
		NativeQuery<Department> query = session.createNativeQuery(sql, Department.class);
		
		
		return query.getResultList();
	}
	

}
