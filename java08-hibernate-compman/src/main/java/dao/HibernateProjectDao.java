package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Project;
import persistence.ProjectDTORawData;

public class HibernateProjectDao extends AbstractHibernateDao implements ProjectDao {

	public List<Project> getProjecs(double bubget) {
		List<Project> result = new ArrayList<Project>();
		Session session = getCurreSession();
		
		Transaction transaction = session.beginTransaction();
		
		String sql = "SELECT * \n"+"FROM project \n"+"WHERE bubget > :bubget";
		NativeQuery<Project> query = session.createNativeQuery(sql, Project.class);
		query.setParameter("bubget", bubget);
		result = query.getResultList();
		transaction.commit();
		return result;
	}

	public List<ProjectDTORawData> getProBubgets() {
		List<ProjectDTORawData> result = new ArrayList<ProjectDTORawData>();
		Session session = getCurreSession();
		
		Transaction transaction = session.beginTransaction();
		
		String sql = "SELECT department.depy_name, \n"+
					"project.pro_name, \n"+"project. bubget \n"+
					"FROM project \n"+
					"JOIN department \n"+
					"ON project.dept_id = department.dept_id";
		NativeQuery<ProjectDTORawData> query = session.createNativeQuery(sql, ProjectDTORawData.class);
		result = query.getResultList();
		transaction.commit();
		return result;
	}

}
