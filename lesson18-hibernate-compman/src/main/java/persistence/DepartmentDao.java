package persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import utils.HibernateUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DepartmentDao {
    public List<Department> getDepartments() {
        List<Department> departments = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String sql = "SELECT * FROM department";
        NativeQuery<?> query = session.createNativeQuery(sql, Department.class);
        departments = (List<Department>) query.getResultList();
        transaction.commit();

        return departments;
    }
}
