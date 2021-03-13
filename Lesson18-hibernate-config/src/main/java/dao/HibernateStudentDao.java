package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.GradeInfo;
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

		String query = "SELECT masv, ten, ho, email FROM sinhvien WHERE masv = 2";
		List<Student> students = session.createNativeQuery(query, Student.class).getResultList();
		transaction.commit();
		return students;
	}

	public List<GradeInfo> getGradeInfos() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		String sql = "SELECT l.tenlop  "+ GradeInfo.GRADE_NAME 
					+ ", concat(sv.ho, ' ', sv.ten) "+ GradeInfo.STUDENT_NAME
					+ ", sv.email "+GradeInfo.STUDENT_EMAIL+" \n"
					+ "FROM sinhvien sv JOIN lop l ON sv.malop = l.malop";
		
		NativeQuery<?> query = session.createNativeQuery(sql);
		
		query.addScalar(GradeInfo.GRADE_NAME, StandardBasicTypes.STRING)
			.addScalar(GradeInfo.STUDENT_NAME, StandardBasicTypes.STRING)
			.addScalar(GradeInfo.STUDENT_EMAIL, StandardBasicTypes.STRING);
		
		query.setResultTransformer(Transformers.aliasToBean(GradeInfo.class));
		
		List<GradeInfo> result = safeList(query);
		transaction.commit();
		
		return result;
	}

	public void detele(Student student) {
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
