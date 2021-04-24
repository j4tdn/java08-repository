package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import org.hibernate.type.Type;

import dto.ProjectDtoRawData;
import persistence.Project;

public class ProjectDao extends AbstractHibernateDao {
	public List<Project> getProjectGreaterThan(Integer budget) {
		Session session = getCurrentSession();

		List<Project> projects = new ArrayList<Project>();

		Transaction transaction = session.beginTransaction();
		String sql = "SELECT * FROM project WHERE budget > :budget";

		var query = session.createNativeQuery(sql, Project.class);
		query.setParameter("budget", budget);

		projects = query.getResultList();
		transaction.commit();

		return projects;
	}

	public List<ProjectDtoRawData> getProjectBudgets() {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();
		String sql = "SELECT p.pro_name as " + ProjectDtoRawData.PRO_NAME + ", p.budget AS " + ProjectDtoRawData.BUDGET
				+ ", d.dept_name as " + ProjectDtoRawData.DEPT_NAME + "\n" + "FROM project p \n"
				+ "join department d ON p.dept_id = p.dept_id;";

		session.createNativeQuery(sql);

		var query = session.createNativeQuery(sql);

		query.addScalar(ProjectDtoRawData.DEPT_NAME, StringType.INSTANCE)
				.addScalar(ProjectDtoRawData.PRO_NAME, StringType.INSTANCE)
				.addScalar(ProjectDtoRawData.BUDGET, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ProjectDtoRawData.class));

		List<ProjectDtoRawData> result = safeList(query);

		transaction.commit();

		return result;
	}

}
