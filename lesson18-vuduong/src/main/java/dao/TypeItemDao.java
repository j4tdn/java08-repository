package dao;

import java.util.List;

import org.hibernate.Transaction;

import persistence.TypeItem;

public class TypeItemDao extends AbstractHibernateDao {
	public List<TypeItem> getAll() {
		Transaction transaction = getCurrentSession().beginTransaction();

		var result = getCurrentSession().createNativeQuery("SELECT * FROM LoaiHang", TypeItem.class).getResultList();

		transaction.commit();
		return result	;
	}
}
