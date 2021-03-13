package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.GradeInfo;
import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao {

	@Override
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
	public List<Student> getAll() {
		List<Student> students = null;
		Transaction transaction = getCurrentSession().beginTransaction();

		// students = getCurrentSession().createNamedQuery(Student.GET_ALL,
		// Student.class).getResultList();
		students = getCurrentSession()
				.createNativeQuery("SELECT masv, ho, 'asds' as lala,  ten, email FROM SinhVien", Student.class)
				.getResultList();

		transaction.commit();
		return students;
	}

	@Override
	public List<GradeInfo> getGradeInfo() {
		Session session = getCurrentSession();

		String sql = "select l.tenlop as "+ GradeInfo.GRADE_NAME
				+", concat(sv.ho, ' ', sv.ten) "+ GradeInfo.STUDENT_NAME +", sv.email "+ GradeInfo.EMAIL +" \n"
				+ "from sinhvien sv join lop l on l.malop = sv.malop;";

		Transaction transaction = session.beginTransaction();
		NativeQuery<?> query = getCurrentSession().createNativeQuery(sql);
		query.addScalar(GradeInfo.GRADE_NAME, StandardBasicTypes.STRING)
				.addScalar(GradeInfo.STUDENT_NAME, StandardBasicTypes.STRING)
				.addScalar(GradeInfo.EMAIL, StandardBasicTypes.STRING)
				.setResultTransformer(Transformers.aliasToBean(GradeInfo.class));

		List<GradeInfo> result = safeList(query);
		transaction.commit();

		return result;
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

}
