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
		// hql
		// native => return list of entity
		// native query => transformer
		// criteria query
//
//		Session session = getCurrentSession();
//		Query<Student> query = session.createNamedQuery(Student.Get_ALL, Student.class);
//		List<Student> students = query.getResultList();

		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();

		// List<Student> students = session.createNamedQuery(Student.Get_ALL,
		// Student.class).getResultList();
		String query = "SELECT masv, concat(ho,'-',ten)ho, ten, email FROM sinhvien WHERE masv = 2";
		List<Student> students = session.createNativeQuery(query, Student.class).getResultList();
		transaction.commit();
		return students;
	}

	public List<GradeInfo> getGradeInfos() {

		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();

		// List<Student> students = session.createNamedQuery(Student.Get_ALL,
		// Student.class).getResultList();
		String query = "SELECT l.tenlop AS "+ GradeInfo.GRADE_NAME+",concat(sv.ho,'-',sv.ten) "+GradeInfo.STUDENT_NAME+",sv.email "+GradeInfo.EMAIL+"\n"
				+ "		FROM sinhvien sv\n" + "		join lop l on l.malop = sv.malop";
		NativeQuery<?> result = session.createNativeQuery(query);
		result.addScalar("gradeName", StandardBasicTypes.STRING)
		.addScalar("studentName", StandardBasicTypes.STRING)
		.addScalar("email", StandardBasicTypes.STRING)
		.setResultTransformer(Transformers.aliasToBean(GradeInfo.class));
		
		List<GradeInfo> rs = safeList(result);
		transaction.commit();
		return rs;
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
