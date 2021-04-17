package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupDao extends AbstractHibernateDao {

	public List<ItemGroupDto> getQuantityOfItemsInEachItemGroup() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			String sql = "SELECT lh.MaLoai AS " + ItemGroupDto.ID + ",\n"
					+ "lh.TenLoai AS " + ItemGroupDto.NAME + ",\n"
					+ "SUM(mh.SoLuong) AS " + ItemGroupDto.QUANTITY + "\n"
					+ "FROM loaihang lh\n"
					+ "JOIN mathang mh ON mh.MaLoai = lh.MaLoai\n"
					+ "GROUP BY lh.MaLoai;";
			NativeQuery<?> query = session.createNativeQuery(sql);
			query.addScalar(ItemGroupDto.ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.NAME, StringType.INSTANCE)
				.addScalar(ItemGroupDto.QUANTITY, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return result;
	}
	
	public List<ItemGroup> getAll() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<ItemGroup> result = new ArrayList<>();
		try {
			String sql = "SELECT * FROM loaihang";
			NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
			result = query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return result;
	}

}
