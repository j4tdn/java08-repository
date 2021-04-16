package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.StringType;
import persistence.Project;
import persistence.ProjectRawData;

import java.util.ArrayList;
import java.util.List;

public class ProjectDao extends AbstractHibernateDao {
    public List<Project> getProjects(double budget) {
        List<Project> result = new ArrayList<>();
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        try {
            String sql = "SELECT * FROM project WHERE budget > :budget";
            NativeQuery<Project> query = session.createNativeQuery(sql, Project.class);
            query.setParameter("budget", budget, DoubleType.INSTANCE);
            result = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return result;
    }

    public List<ProjectRawData> getProBudgets() {
        List<ProjectRawData> result = new ArrayList<>();
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        try {
            String sql = "SELECT department.dept_name AS " + ProjectRawData.DEPT_NAME + ", project.pro_name AS " + ProjectRawData.PRO_NAME + ", project.budget AS " + ProjectRawData.BUDGET + " FROM project \n" +
                    "JOIN department \n" +
                    "ON project.dept_id = department.dept_id";
            NativeQuery<?> query = session.createNativeQuery(sql);
            query.addScalar(ProjectRawData.DEPT_NAME, StringType.INSTANCE)
                    .addScalar(ProjectRawData.PRO_NAME, StringType.INSTANCE)
                    .addScalar(ProjectRawData.BUDGET, DoubleType.INSTANCE)
                    .setResultTransformer(Transformers.aliasToBean(ProjectRawData.class));
            result = safeList(query);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return result;
    }


}
