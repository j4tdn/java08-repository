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
		// hql: hibernate query language => entity name & attributes
		// native query => return list of entity
		// native query => transformer
		// criteria query

		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		// List<Student> students =
		// session.createNamedQuery(Student.GET_ALL).getResultList();
		String query = "SELECT masv, concat(ho,'-', ten) ho, ten, email FROM sinhvien WHERE masv = 2";
		List<Student> students = session.createNativeQuery(query, Student.class).getResultList();

		transaction.commit();
		return students;

	}

	public List<GradeInfo> getGradeInfo() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		String sql = "SELECT l.tenlop  " + GradeInfo.GRADE_NAME +",\n"
				+ "	   concat(sv.ho,' ',sv.ten) "+ GradeInfo.STUDENT_NAME+",\n"
				+ "       sv.email " + GradeInfo.EMAIL+" \n"
				+ "FROM sinhvien sv\n" 
				+ "JOIN lop l ON l.malop = sv.malop;";
		NativeQuery<?> query = session.createNativeQuery(sql);
		
		query.addScalar("gradeName", StandardBasicTypes.STRING)
		.addScalar("studentName", StandardBasicTypes.STRING)
		.addScalar("email", StandardBasicTypes.STRING)
		.setResultTransformer(Transformers.aliasToBean(GradeInfo.class));
		List<GradeInfo> result = safeList(query);
		
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