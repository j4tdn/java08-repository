package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao{

	public void save(Student student) {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(student);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		
	}

	public List<Student> getAll() {
		//hql: hibernate query language => Entity name
		//native query => return list of entity
		//native query => transformer
		//criteria query
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		//List<Student> students = session.createNamedQuery(Student.GET_ALL, Student.class).getResultList();
		String query = "SELECT * FROM sinhvien WHERE sinhvien.masv = 2";
		List<Student> students = session.createNativeQuery(query, Student.class).getResultList();
		transaction.commit();
		return students;
	}

}
