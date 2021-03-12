package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao {

	@Override
	public void save(Student student) {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(new Student(2, "Hoang", "Nam", "hoangnam@gmail.com"));

		} catch (Exception e) {
			transaction.rollback();
		}

		transaction.commit();
	}

	@Override
	public List<Student> getAll() {
		List<Student> students = null;
		Transaction transaction = getCurrentSession().beginTransaction();

		// students = getCurrentSession().createNamedQuery(Student.GET_ALL,
		// Student.class).getResultList();
		students = getCurrentSession().createNativeQuery("SELECT masv, ho, 'asds' as lala,  ten, email FROM SinhVien", Student.class).getResultList();

		transaction.commit();
		return students;
	}

}
