package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		// native sql
//		String sql = "SELECT * FROM LoaiHang";
//		
//		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);

		// HQL
//		String query="SELECT ig FROM ItemGroup ig WHERE ig.igId= 2 ";
//		
//		TypedQuery<ItemGroup> hql=session.createQuery(query,ItemGroup.class);

		//

		Query<ItemGroup> hql = session.createNamedQuery(ItemGroup.SELECT_ALL, ItemGroup.class);
		return hql.getResultList();
	}

	@Override
	public void save(ItemGroup itemGroup) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {

			session.save(itemGroup);
			System.out.println("Save "+itemGroup.getIgName()+" successful!");
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}

}