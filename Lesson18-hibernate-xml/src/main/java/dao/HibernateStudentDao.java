package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Student;

public class HibernateStudentDao extends AbstracHibernateDao implements StudentDao {

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
		// hql hibernate query language => Entity name & attribute
		// native query => return list entity
		// native query => transformer
		// criterial query
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		// List<Student> students = session.createNamedQuery(Student.GET_ALL,
		// Student.class).getResultList();

		String query = "SELECT masv,  ten, ho, email FROM sinhvien WHERE masv = 2";
		List<Student> students = session.createNativeQuery(query, Student.class).getResultList();
		transaction.commit();
		return students;

	}

}
