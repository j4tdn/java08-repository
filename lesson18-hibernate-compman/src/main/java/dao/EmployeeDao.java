package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dto.EmployeeDepartmentDTO;
import persistence.Employee;
import utils.HibernateUtil;

public class EmployeeDao {
	public List<Employee> getEmps(String deptId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> result = new ArrayList<Employee>();
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
	

	public List<Employee> getAllEmployeesByDeptId(String deptId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		String sql = "SELECT * FROM employee e WHERE e.dept_id = :deptId";
		NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);
		query.setParameter("deptId", deptId);
		List<Employee> result =  query.getResultList();
		transaction.commit();
		return result;
	}
	
//	public List<EmployeeDepartmentDTO> getAllEmployeeDepartment() {
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		String sql = "select d.dept_id " + EmployeeDepartmentDTO.DEPT_ID+ ", d.dept_name"
//				+ EmployeeDepartmentDTO.DEPT_NAME + ", e.emp_id " + EmployeeDepartmentDTO.EMP_ID  + ", e.emp_name " + EmployeeDepartmentDTO.EMP_NAME + " from department d\n"
//				+ "join employee e ON d.dept_id = e.dept_id";
//		NativeQuery<?> query = session.createNativeQuery(sql)
//		.addScalar(EmployeeDepartmentDTO.DEPT_ID, StandardBasicTypes.STRING)
//		.addScalar(EmployeeDepartmentDTO.DEPT_NAME, StandardBasicTypes.STRING)
//		.addScalar(EmployeeDepartmentDTO.EMP_ID, StandardBasicTypes.STRING)
//		.addScalar(EmployeeDepartmentDTO.EMP_NAME, StandardBasicTypes.STRING);
//		query.setResultTransformer(Transformers.aliasToBean(GradeInfo.class));
//		List<EmployeeDepartmentDTO> result = safeList(query);
//		transaction.commit();
//	}

}
