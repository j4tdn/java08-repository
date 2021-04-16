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

public class ProjectDao extends AbstracHibernateDao {

	public List<Project> getProjectByBudget(double budget) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Project> projects = new ArrayList<Project>();
		try {
			String query = "SELECT * FROM project WHERE budget > :budget";

			NativeQuery<Project> nativeQuery = session.createNativeQuery(query, Project.class);
//		nativeQuery.setParameter(1, budget);
			nativeQuery.setParameter("budget", budget, DoubleType.INSTANCE);
			 projects = nativeQuery.getResultList();
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return projects;
	}
	
	public List<ProjectDtoRawData> getProjectSumBudget() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<ProjectDtoRawData> projectsBudget = new ArrayList<ProjectDtoRawData>();
		try {
			String query = "SELECT department.dept_name AS " + ProjectDtoRawData.DEPT_NAME + ", "
					+ " project.pro_name AS " + ProjectDtoRawData.PRO_NAME  + ","
					+ " project.budget AS "+ ProjectDtoRawData.BUDGET  + "  \n"
					+ " FROM project \n"
					+ " JOIN department \n"
					+ " ON project.dept_id = department.dept_id";

			NativeQuery<?> nativeQuery = session.createNativeQuery(query);
			
			nativeQuery.addScalar(ProjectDtoRawData.DEPT_NAME, StringType.INSTANCE)
						.addScalar(ProjectDtoRawData.PRO_NAME, StringType.INSTANCE)
						.addScalar(ProjectDtoRawData.BUDGET, DoubleType.INSTANCE)
						.setResultTransformer(Transformers.aliasToBean(ProjectDtoRawData.class));
			
			projectsBudget = safeList(nativeQuery);
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return projectsBudget;
	}
}
