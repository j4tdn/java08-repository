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
		// hql: hibernate query language => Entity name & attribute
		// native query => return list of
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
//		List<Student> students = session.createNamedQuery(Student.GET_ALL, Student.class).getResultList();
		String query = "SELECT masv, ho, concat(ho, '-', ten) a, ten, email FROM sinhvien WHERE masv = 2";
		List<Student> students = session.createNativeQuery(query, Student.class).getResultList();

		return students;

	}

}
