package dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import persistence.Department;

import java.util.concurrent.TimeUnit;

public class DepartmentDao extends AbstractHibernateDao {
    public Department get(String id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();

        // sẽ truy vấn 100% vào db và trả về dữ liệu thật tế
        Department d1 = session.get(Department.class, id);
        System.out.println("d1: " + d1);
        /*//  sẽ truy vấn db nhưng trả về 1 proxy chứa id, khi nào cần dùng thì nó mới get đối tượng thật tế
        session.load(Department.class, 1);*/

        Department d2 = session.get(Department.class, id);
        System.out.println("d2: " + d2);

        Department d3 = session.get(Department.class, "mgm-mu");
        System.out.println("d3: " + d2);

        try {
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        return null;
    }

    public Department getInTwosSessions(String id) {
        Session session1 = getCurrentSession();
        Session session2 = getCurrentSession();
        Transaction transaction = session1.beginTransaction();

        // sẽ truy vấn 100% vào db và trả về dữ liệu thật tế
        Department d1 = session1.get(Department.class, id);
        System.out.println("d1: " + d1);

        Department d2 = session2.get(Department.class, id);
        System.out.println("d2: " + d2);
        try {
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        return null;
    }

    public Department getSessionWithOpenSession(String id) {
        Session session1 = openSession();
        Session session2 = openSession();
        System.out.println("s1: " + System.identityHashCode(session1));
        System.out.println("s2: " + System.identityHashCode(session2));

        Department d1 = session1.get(Department.class, id);
        System.out.println("d1: " + d1);

        //remove 1 instance in first-level cache of the entity
        session1.evict(d1);
        /*Department d2 = session2.get(Department.class, id);
        System.out.println("d2: " + d2);*/
        var d2 = session1.get(Department.class, id);
        System.out.println("d2: " + d2);

        //remove all data in first-level cast
        session1.clear();

        Department d3 = session1.get(Department.class, id);
        System.out.println("d3: " + d3);

        return null;
    }

    public Department getInSecondLevelCache(String id) {
        Session session1 = openSession();
        Session session2 = openSession();

        Department d1 = session1.get(Department.class, id);
        System.out.println("d1: " + d1);
        sleep(5);
        Department d2 = session2.get(Department.class, id);
        System.out.println("d2: " + d2);
        return null;
    }

    public Department getDepartment(String id) {
        Session session = getCurrentSession();
        Department result = null;
        Transaction transaction = session.beginTransaction();
        try {
            Criteria criteria = session.createCriteria(Department.class);
            result = (Department) criteria.add(Restrictions.eq("deptId", id))
                    .uniqueResult();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        return result;


    }

    private void sleep(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
