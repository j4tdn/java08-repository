package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.Project;

public class ProjectDao extends AbstractHibernateDao {

	public List<Project> getPros(Integer budget) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Project> result = new ArrayList<>();
		try {
			String sql = "SELECT * FROM project"
					+ "\nWHERE budget > :budget";
			NativeQuery<Project> query = session.createNativeQuery(sql, Project.class);
			query.setParameter("budget", budget);
			result = query.getResultList();
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		return result;
	}
}
