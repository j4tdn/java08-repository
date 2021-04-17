package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao {

	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> getTotalOfItem() {
		List<ItemGroupDto> itemGroups = new ArrayList<ItemGroupDto>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "select ml.MaLoai " + ItemGroupDto.ITEM_GROUP_ID + ", ml.TenLoai "
					+ ItemGroupDto.ITEM_GROUP_NAME + ",sum(mh.SoLuong) " + ItemGroupDto.QTY + "\n"
					+ "from mathang mh JOIN loaihang ml ON mh.MaLoai = ml.MaLoai   \n" + "group by mh.MaLoai";

			NativeQuery<?> query = session.createNativeQuery(sql);

			query.addScalar(ItemGroupDto.ITEM_GROUP_ID, StandardBasicTypes.INTEGER)
					.addScalar(ItemGroupDto.ITEM_GROUP_NAME, StandardBasicTypes.STRING)
					.addScalar(ItemGroupDto.QTY, StandardBasicTypes.INTEGER)
					.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));

			itemGroups = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return itemGroups;
	}
}
