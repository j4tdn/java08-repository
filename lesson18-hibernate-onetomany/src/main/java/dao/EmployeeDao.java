package dao;

import org.hibernate.Transaction;

import persistence.Employee;
import utils.HibernateUtils;


public class EmployeeDao extends AbstractHibernateDao{
	public void save(Employee employee) {
		var session = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();

		try {
			session.saveOrUpdate(employee);
			
			//Employee result =session.get(Employee.class, 1);
			
			//System.out.println(result.getAccounts());
			
		} catch (Exception e) {
			transaction.rollback();
		}
		
		transaction.commit();
	}
}