package dao;

import java.util.List;

import javax.transaction.Transactional;

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
			// TODO: handle exception
			transaction.rollback();
		}
	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub

		// hql: hibernate query language => entity name & attribute

		// native query =>return list of entity

		// native query =>transformer

		// criteria query

//		Session session = getCurrentSession();
//		Query<Student> query = session.createNamedQuery();
//
//		
//		query.getResultList();
		
		Session session = getCurrentSession();
		Transaction transaction = getCurrentSession().beginTransaction();
		String query ="SELECT masv, concat(ho,'-',ten)ho, ten, email FROM sinhvien WHERE masv =2";
		List<Student> students =session.createNativeQuery(query, Student.class).getResultList();
		transaction.commit();
		return students;
	}

}
