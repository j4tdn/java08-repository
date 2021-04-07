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

	@Override
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
	
	@Override
	public List<Student> getAll() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		// List<Student> students = session.createNamedQuery(Student.GET_ALL, Student.class).getResultList();
		String query = "SELECT masv, ho, concat(ho,'-', ten), ten, email FROM sinhvien";
		List<Student> students =  session.createNativeQuery(query, Student.class)
										 .getResultList();
		transaction.commit();
		return students;
	}
	
	@Override
	public List<GradeInfo> getGradeInfos() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		String sql = "SELECT l.tenlop " + GradeInfo.GRADE_NAME + ",\n"
				+ "	   concat(sv.ho, ' ', sv.ten) " + GradeInfo.STUDENT_NAME + ",\n"
				+ "    sv.email " + GradeInfo.EMAIL + "\n"
				+ "FROM sinhvien sv\n"
				+ "JOIN lop l ON l.MaLop = sv.MaLop";
		
		NativeQuery<?> query = session.createNativeQuery(sql);
		
		query.addScalar(GradeInfo.GRADE_NAME, StandardBasicTypes.STRING)
			 .addScalar(GradeInfo.STUDENT_NAME, StandardBasicTypes.STRING)
			 .addScalar(GradeInfo.EMAIL, StandardBasicTypes.STRING)
			 .setResultTransformer(Transformers.aliasToBean(GradeInfo.class));
		
		List<GradeInfo> result = safeList(query);
		transaction.commit();
		return result;
	}
}
