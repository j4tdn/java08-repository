package dao;

import java.nio.channels.SeekableByteChannel;
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
		// hql: khong can dung masv ma dung truc tiep student (Entity name & attribute)
		// native query: tra ve sinh vien luon => return list of entity
		// native query => transformer
		// criteria query:

		// List<Student> students = null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		//List<Student> students = session.createNamedQuery(Student.GET_ALL, Student.class).getResultList();
		String query = "SELECT * FROM sinhvien WHERE masv = 2";
		List<Student> students = session.createNativeQuery(query, Student.class).getResultList();
		
		transaction.commit();
		
		return students;
	}

}