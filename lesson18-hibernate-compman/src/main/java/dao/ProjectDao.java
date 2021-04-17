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
import persistence.ProjectRawDto;

public class ProjectDao extends AbstractHibernateDao{
	public List<Project> getProjects(double budget) {
		List<Project> result = new ArrayList<>();
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "SELECT * FROM project WHERE budget > :budget";
			NativeQuery<Project> query = session.createNativeQuery(sql, Project.class);
			query.setParameter("budget", budget, DoubleType.INSTANCE);
			result = query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<ProjectRawDto> getProBudgets() {
		List<ProjectRawDto> result = new ArrayList<>();
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		try {
			//String sql = "SELECT d.dept_name AS" + ProjectRawDto.DEPT_NAME + ", p.pro_name AS" +  ProjectRawDto.PRO_NAME + ", p.budget AS" + ProjectRawDto.BUDGET+ "FROM project p JOIN department d ON p.dept_id = d.dept_id";
			String sql = "SELECT department.dept_name AS " + ProjectRawDto.DEPT_NAME + " ,\n"
					+ "project.pro_name AS " + ProjectRawDto.PRO_NAME + ", \n"
					+ "project.budget AS " + ProjectRawDto.BUDGET + " \n"
					+ "FROM project\n"
					+ "JOIN department \n"
					+ "ON project.dept_id = department.dept_id";
			NativeQuery<?> query = session.createNativeQuery(sql);
			query.addScalar(ProjectRawDto.DEPT_NAME, StringType.INSTANCE)
			     .addScalar(ProjectRawDto.PRO_NAME, StringType.INSTANCE)
			     .addScalar(ProjectRawDto.BUDGET, DoubleType.INSTANCE)
			     .setResultTransformer(Transformers.aliasToBean(ProjectRawDto.class));
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
