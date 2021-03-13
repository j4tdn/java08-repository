package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.GradeInfo;
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
	public void delete(Student student) {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.remove(student);
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
	
	
	public List<GradeInfo> getGradeInfos() {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		String sql = "SELECT l.tenlop "+GradeInfo.GRADE_NAME+",\n" + 
				"       concat(sv.ho, ' ', sv.ten) "+GradeInfo.STUDENT_NAME + ",\n" + 
				"       sv.email email\n" + 
				"FROM sinhvien sv\n" + 
				"JOIN lop l WHERE l.malop = sv.malop";
		
//		List<GradeInfo> result = session.createNativeQuery(query, GradeInfo.class).getResultList();
//		transaction.commit();
		
		NativeQuery<?> query = session.createNativeQuery(sql);
		query.addScalar("gradeName", StandardBasicTypes.STRING);
		query.addScalar("studentName", StandardBasicTypes.STRING);
		query.addScalar("email", StandardBasicTypes.STRING);
		
		query.setResultTransformer(Transformers.aliasToBean(GradeInfo.class));
		
		List<GradeInfo> result = safeList(query);
		
		transaction.commit();
		return result;
	}

}