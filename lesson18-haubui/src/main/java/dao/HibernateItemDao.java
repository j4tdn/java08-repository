package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.LocalDateType;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemDto;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao {

	@SuppressWarnings("deprecation")
	public List<ItemDto> get(LocalDate date) {
		List<ItemDto> items = new ArrayList<ItemDto>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "select mh.MaMH " + ItemDto.ITEM_ID + ", mh.TenMH " + ItemDto.ITEM_NAME + ",dh.NgayTao "
					+ ItemDto.DATE + " \n"
					+ "from mathang mh JOIN chitietdonhang ctdh ON mh.MaMH = ctdh.MaMH  JOIN donhang dh ON ctdh.MaDH = dh.MaDH \n"
					+ "where cast(dh.Ngaytao as Date) = :date ";

			NativeQuery<?> query = session.createNativeQuery(sql);
			query.setParameter("date", date, LocalDateType.INSTANCE);

			query.addScalar(ItemDto.ITEM_ID, StandardBasicTypes.INTEGER)
					.addScalar(ItemDto.ITEM_NAME, StandardBasicTypes.STRING)
					.addScalar(ItemDto.DATE, LocalTimeType.INSTANCE)
					.setResultTransformer(Transformers.aliasToBean(ItemDto.class));

			items = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return items;
	}

	public List<String> getHighestSaleOut(Integer year) {
		List<String> result = null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "select mh.TenMH \n "
					+ "from mathang mh JOIN chitietdonhang ctdh ON mh.MaMH = ctdh.MaMH  JOIN donhang dh ON ctdh.MaDH = dh.MaDH\n"
					+ "where year(dh.Ngaytao) = :year \n" + "group by ctdh.MaMH\n" + "ORDER BY sum(ctdh.SoLuong) desc\n"
					+ "limit 3";

			NativeQuery<?> query = session.createNativeQuery(sql);
			query.setParameter("year", year);
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return result;
	}

	@Override
	public List<Item> getAll() {
		List<Item> items = new ArrayList<Item>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "SELECT * FROM mathang mh ORDER BY mh.MaLoai";

			NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
			items = query.getResultList();

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return items;
	}
}