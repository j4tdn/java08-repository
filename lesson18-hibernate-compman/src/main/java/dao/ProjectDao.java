package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.StringType;

import persistence.Project;
import persistence.ProjectDtoRawData;

public class ProjectDao extends AbstractHibernateDao {

	public List<Project> getProjects(Integer budget) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Project> result = new ArrayList<>();
		try {
			String sql = "SELECT * FROM project" + "\nWHERE budget > :budget";
			NativeQuery<Project> query = session.createNativeQuery(sql, Project.class);
			query.setParameter("budget", budget);
			result = query.getResultList();
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		return result;
	}

	public List<ProjectDtoRawData> getProBudgets() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<ProjectDtoRawData> result = new ArrayList<>();
		try {
			String sql = "SELECT department.dept_name AS "+ ProjectDtoRawData.DEPT_NAME + ",\n"
					+ "	project.pro_name AS " + ProjectDtoRawData.PRO_NAME + ",\n"
					+ "	project.budget AS " + ProjectDtoRawData.BUDGET + "\n"
					+ "FROM project\n"
					+ "JOIN department\n"
					+ "ON project.dept_id = department.dept_id;";
			NativeQuery<?> query = session.createNativeQuery(sql);
			query.addScalar(ProjectDtoRawData.DEPT_NAME, StringType.INSTANCE)
				.addScalar(ProjectDtoRawData.PRO_NAME, StringType.INSTANCE)
				.addScalar(ProjectDtoRawData.BUDGET, DoubleType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ProjectDtoRawData.class));
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return result;
	}
}
