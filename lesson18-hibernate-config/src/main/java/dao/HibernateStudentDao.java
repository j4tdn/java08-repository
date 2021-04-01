package dao;

import java.nio.channels.SeekableByteChannel;
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
		// hql: khong can dung masv ma dung truc tiep student (Entity name & attribute)
		// native query: tra ve sinh vien luon => return list of entity
		// native query => transformer
		// criteria query:

		// List<Student> students = null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		//List<Student> students = session.createNamedQuery(Student.GET_ALL, Student.class).getResultList();
		String query = "SELECT * FROM sinhvien";
		List<Student> students = session.createNativeQuery(query, Student.class).getResultList();
		
		transaction.commit();
		
		return students;
	}

	public List<GradeInfo> getGradeInfos() {
		
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		String sql = "SELECT l.TenLop " +  GradeInfo.GRADE_NAME + ", \n" + 
				"	           concat(sv.ho, ' ', sv.ten) "+ GradeInfo.STUDENT_NAME  +",\n" + 
				"	           sv.email "+ GradeInfo.EMAIL + "\n" + 
				"	   FROM sinhvien sv\n" + 
				"	   JOIN lop l ON l.MaLop = sv.MaLop;";

		NativeQuery<?> query = session.createNativeQuery(sql);
		
		query.addScalar(GradeInfo.GRADE_NAME, StandardBasicTypes.STRING)
		.addScalar(GradeInfo.STUDENT_NAME, StandardBasicTypes.STRING)
		.addScalar(GradeInfo.EMAIL, StandardBasicTypes.STRING)
		.setResultTransformer(Transformers.aliasToBean(GradeInfo.class));

		List<GradeInfo> result = safeList(query);
		
		transaction.commit();
		
		return result;
	}

	public void delete(Student student) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		String query = "SELECT * FROM sinhvien WHERE masv = 2";

		try {
			session.remove(student);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		
	}

}