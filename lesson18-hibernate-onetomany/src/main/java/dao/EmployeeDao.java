package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import persistence.Account;
import persistence.Employee;
import utils.HibernateUtil;

import java.util.Set;

public class EmployeeDao extends AbstractHibernateDao {
    public void save(Employee emp) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(emp);

            //cannot fetch lazy
//            Employee result = session.get(Employee.class, 12);
//            Set<Account> accounts = result.getAccounts();
//            System.out.println(accounts);
        } catch (Exception e) {
            transaction.rollback();
        }
        transaction.commit();
    }
}
