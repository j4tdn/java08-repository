package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao {

	public void save(Student student) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(student);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();

	}

	public List<Student> getAll() {
		// hql
		// native => return list of entity
		// native query => transformer
		// criteria query
//
//		Session session = getCurrentSession();
//		Query<Student> query = session.createNamedQuery(Student.Get_ALL, Student.class);
//		List<Student> students = query.getResultList();

		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();

		
		//List<Student> students = session.createNamedQuery(Student.Get_ALL, Student.class).getResultList();
		String query="SELECT masv, concat(ho,'-',ten)ho, ten, email FROM sinhvien WHERE masv = 2";
		List<Student> students = session.createNativeQuery(query, Student.class).getResultList();
		transaction.commit();
		return students;
	}

}
