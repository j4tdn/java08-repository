package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StringType;

import persistence.ItemDto;

public class ItemDao extends AbstractHibernateDao {
	
	public List<ItemDto> getItemsByOrderDate(LocalDate localDate) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<ItemDto> result = new ArrayList<>();
		try {
			String sql = "SELECT mh.MaMH AS " + ItemDto.ID + ",\n"
					+ "mh.TenMH AS " + ItemDto.NAME + ",\n"
					+ "CAST(dh.NgayTao AS time) AS " + ItemDto.ORDER_TIME + "\n"
					+ "FROM mathang mh\n"
					+ "JOIN chitietdonhang ctdh ON ctdh.MaMH = mh.MaMH\n"
					+ "JOIN donhang dh ON dh.MaDH = ctdh.MaDH\n"
					+ "WHERE CAST(dh.NgayTao AS date) = :localDate";
			NativeQuery<?> query = session.createNativeQuery(sql);
			query.setParameter("localDate", localDate);
			query.addScalar(ItemDto.ID, IntegerType.INSTANCE)
				.addScalar(ItemDto.NAME, StringType.INSTANCE)
				.addScalar(ItemDto.ORDER_TIME, LocalTimeType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return result;
	}
	
	public List<ItemDto> getTop3BestSellerItemsByYear(Integer year) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<ItemDto> result = new ArrayList<>();
		try {
			String sql = "SELECT mh.TenMH AS name, SUM(ctdh.SoLuong) AS SoLuong FROM mathang mh\n"
					+ "JOIN chitietdonhang ctdh ON ctdh.MaMH = mh.MaMH\n"
					+ "JOIN donhang dh ON dh.MaDH = ctdh.MaDH\n"
					+ "WHERE CAST(dh.NgayTao AS year) = :year\n"
					+ "GROUP BY mh.MaMH\n"
					+ "ORDER BY SoLuong DESC\n"
					+ "LIMIT 3";
			NativeQuery<?> query = session.createNativeQuery(sql);
			query.setParameter("year", year);
			query.addScalar(ItemDto.NAME, StringType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return result;
	}

}
