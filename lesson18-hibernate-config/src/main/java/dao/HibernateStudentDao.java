package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.GradeInfo;
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

	public List<GradeInfo> getGradeInfos() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		String sql = "SELECT l.tenlop gradeName, concat(sv.ho, ' ', sv.ten) studentName, sv.email email\n"
				+ "FROM sinhvien sv\n" + "JOIN lop l ON l.malop = sv.malop";
		NativeQuery<?> query = session.createNativeQuery(sql);
		query.addScalar("gradeName", StandardBasicTypes.STRING).addScalar("studentName", StandardBasicTypes.STRING)
				.addScalar("email", StandardBasicTypes.STRING);
		query.setResultTransformer(Transformers.aliasToBean(GradeInfo.class));
		List<GradeInfo> result = safeList(query);
//		List<GradeInfo> result =  session.createNativeQuery(query, GradeInfo.class).getResultList();
		transaction.commit();
		return result;
	}

	public void delete(Student student) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.remove(student);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		
	}

}
