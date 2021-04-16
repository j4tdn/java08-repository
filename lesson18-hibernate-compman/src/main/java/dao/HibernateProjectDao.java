package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Project;
import persistence.ProjectInfo;

public class HibernateProjectDao extends AbstractHibernateDao implements ProjectDao {

	public List<Project> get(Double budget) {
		List<Project> projects = new ArrayList<Project>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "SELECT * FROM project WHERE budget > :budget";

			NativeQuery<Project> query = session.createNativeQuery(sql, Project.class);
			query.setParameter("budget", budget);

			projects = query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return projects;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<ProjectInfo> getTotalOfBudget(Integer year) {
		List<ProjectInfo> projectInfos = new ArrayList<ProjectInfo>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "SELECT d.dept_name " + ProjectInfo.DEPT_NAME
					+ ", group_concat(concat(p.pro_name, ': ', p.budget) SEPARATOR ', ') " + ProjectInfo.PROJECT_DETAILS
					+ ", SUM(p.budget) " + ProjectInfo.BUDGET + "\nFROM project p \n"
					+ "JOIN department d ON p.dept_id = d.dept_id \n"
					+ "WHERE p.pro_id in (SELECT pe.pro_id FROM project_employee pe WHERE year(pe.start_date) = :year)\r\n"
					+ "GROUP BY p.dept_id;";

			NativeQuery<?> query = session.createNativeQuery(sql);
			query.setParameter("year", year);

			query.addScalar(ProjectInfo.DEPT_NAME, StandardBasicTypes.STRING)
					.addScalar(ProjectInfo.PROJECT_DETAILS, StandardBasicTypes.STRING)
					.addScalar(ProjectInfo.BUDGET, StandardBasicTypes.DOUBLE)
					.setResultTransformer(Transformers.aliasToBean(ProjectInfo.class));

			projectInfos = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return projectInfos;
	}

	@Override
	public Project getHighestBudget(Integer year) {
		Project project = null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "SELECT * "
					+ "FROM project "
					+ "WHERE pro_id in (SELECT pe.pro_id FROM project_employee pe WHERE year(pe.start_date) = :year) "
					+ "ORDER BY budget DESC "
					+ "LIMIT 1";

			NativeQuery<Project> query = session.createNativeQuery(sql, Project.class);
			query.setParameter("year", year);

			project = query.getSingleResult();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return project;
	}

}
