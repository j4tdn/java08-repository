package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

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

		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();

		// hql : hibernate query language -> entity name && attributes

		// List<Student> students = session.createNamedQuery(Student.GET_ALL, Student.class).getResultList();

		// native query -> return list entity

		String query = "SELECT * FROM sinhvien";

		List<Student> students = session.createNativeQuery(query, Student.class).getResultList();

		// native query -> transformer

		// criteria query

		transaction.commit();

		return students;
	}

}
