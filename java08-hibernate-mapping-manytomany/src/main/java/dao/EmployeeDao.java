package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import persistences.Account;
import persistences.Employee;

import java.util.Set;

public class EmployeeDao extends AbstractHibernateDao {

    public void save(Employee employee){

        Integer id = null ;

        Session session = getCurrentSession();

        Transaction transaction = session.beginTransaction();

        try {
            // session co hai cach de luu du lieu vao database : save() & persist() ;
//           id =  session.save(employee);

//            Employee emp = session.get(Employee.class,69);
//
//            Set<Account> accounts = emp.getAccounts();
//
//            System.out.println(accounts);

            session.saveOrUpdate(employee);

        }
        catch(Exception e){
            transaction.rollback();
            e.printStackTrace();
        }

        transaction.commit();

    }
}
