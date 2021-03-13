package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
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

	@SuppressWarnings("deprecation")
	public List<GradeInfo> getGradeInfos() {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();

		String sql = "SELECT l.tenlop "+GradeInfo.GRADE_NAME+", concat(sv.ho,' ',sv.ten) "+GradeInfo.STUDENT_NAME+", sv.email "+GradeInfo.EMAIL
				  + " FROM sinhvien sv JOIN lop l ON sv.malop = l.malop ";

		NativeQuery<?> query = session.createNativeQuery(sql);

		query.addScalar(GradeInfo.GRADE_NAME,StandardBasicTypes.STRING)
		     .addScalar(GradeInfo.STUDENT_NAME,StandardBasicTypes.STRING)
			 .addScalar(GradeInfo.EMAIL,StandardBasicTypes.STRING)
			 .setResultTransformer(Transformers.aliasToBean(GradeInfo.class));
		
		List<GradeInfo> gradeInfos = safeList(query);
		
		transaction.commit();

		return gradeInfos;
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
