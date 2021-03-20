package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.sharepk.Account;
import persistence.sharepk.Employee;

//import persistence.Employee;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao {

	public void save(Employee employee) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			Account account = new Account(123, "123-685-471");
			account.setEmployee(employee);
			employee.setAccount(account);
			session.saveOrUpdate(employee);
		//	session.evict(employee);
			
		//	System.out.println("state 1: " + session.contains(employee)); //kiem tra phai persistence obj ko
			
		//	PersistenceUnitUtil util = session.getEntityManagerFactory().getPersistenceUnitUtil();
			
		//	System.out.println("state 2: " + util.getIdentifier(employee));
			
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}

	public Employee get(Integer id) {
		Employee emp = null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			
			emp = session.get(Employee.class, id);
			
			Account accReult = emp.getAccount();
			System.out.println("xx: " + accReult);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		return emp;
	}

}
