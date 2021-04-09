package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import persistence.Employee;
import utils.HibernateUtil;

import java.util.*;

public class EmployeeDao {
    public List<Employee> getEmployees(String departmentId) {
        List<Employee> employees = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String sql = "SELECT * FROM employee " + "WHERE dept_id = :id";
        NativeQuery<?> query = session.createNativeQuery(sql, Employee.class);
        query.setParameter("id", departmentId);
        employees = (List<Employee>) query.getResultList();
        transaction.commit();

        return employees;
    }
}
