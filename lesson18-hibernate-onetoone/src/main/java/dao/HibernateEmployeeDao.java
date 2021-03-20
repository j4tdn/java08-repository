package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.sharepk.Account;
import persistence.sharepk.Employee;

public class HibernateEmployeeDao extends AbstractHibernateDao implements EmployeeDao {

	@Override
	public void save(Employee employee) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			Account account = new Account(1,  "123-456-789");
			account.setEmployee(employee);
			employee.setAccount(account);
			session.saveOrUpdate(employee);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}

	@Override
	public Employee get(Integer id) {
		Employee emp = null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			emp = session.get(Employee.class, id);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		return emp;
	}

}
