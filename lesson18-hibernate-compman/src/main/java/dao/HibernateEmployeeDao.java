package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Employee;
import persistence.EmployeeDto;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao {

	public List<Employee> get(String id) {
		List<Employee> emps = new ArrayList<Employee>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "SELECT * FROM employee WHERE dept_id = :id";

			NativeQuery<Employee> query = session.createNativeQuery(sql, Employee.class);
			query.setParameter("id", id);

			emps = query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return emps;
	}

	public List<EmployeeDto> getAll() {
		List<EmployeeDto> emps = new ArrayList<EmployeeDto>();
//		Session session = getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		try {
////			String sql = "SELECT d.dept_id " + EmployeeDto.DEPT_ID + ", d.dept_name " + EmployeeDto.DEPT_NAME
////					+ " ,e.emp_id " + EmployeeDto.EMP_ID + ",e.emp_name " + EmployeeDto.EMP_NAME + ",e.age "
////					+ EmployeeDto.AGE + ",e.salary " + EmployeeDto.SALARY
////					+ " FROM employee e JOIN department d ORDER BY d.dept_id";
//
//			String sql = "SELECT * FROM employee";
//			
//			NativeQuery<?> query = session.createNativeQuery(sql);
//
//			query.addScalar(EmployeeDto.DEPT_ID, StandardBasicTypes.STRING)
//					.addScalar(EmployeeDto.DEPT_NAME, StandardBasicTypes.STRING)
//					.addScalar(EmployeeDto.EMP_ID, StandardBasicTypes.STRING)
//					.addScalar(EmployeeDto.EMP_NAME, StandardBasicTypes.STRING)
//					.addScalar(EmployeeDto.AGE, StandardBasicTypes.STRING)
//					.addScalar(EmployeeDto.SALARY, StandardBasicTypes.STRING)
//					.setResultTransformer(Transformers.aliasToBean(EmployeeDto.class));
//
//			emps = safeList(query);
//
//			transaction.commit();
//		} catch (Exception e) {
//			transaction.rollback();
//		}

		return emps;
	}
}
