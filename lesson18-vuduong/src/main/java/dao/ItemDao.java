package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateType;
import org.hibernate.type.StringType;

import dto.ItemWithSaleDateDto;
import persistence.Item;

public class ItemDao extends AbstractHibernateDao {
	public List<ItemWithSaleDateDto> getItemsSaleInDate(LocalDate date) {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();
		String sql = "SELECT mh.MaMH as " + ItemWithSaleDateDto.ITEM_ID + ", " 
				+ "mh.TenMH as " + ItemWithSaleDateDto.ITEM_NAME + ", " 
				+ "dh.NgayTao as " + ItemWithSaleDateDto.SALE_DATE + "\n "
				+ "FROM mathang mh \r\n" + "JOIN chitietdonhang ctdh ON mh.MaMH = ctdh.MaMH\r\n"
				+ "JOIN donhang dh ON ctdh.MaDH = dh.MaDH \n" 
				+ "WHERE cast(dh.NgayTao as Date) = :lDate";

		session.createNativeQuery(sql);

		var query = session.createNativeQuery(sql);

		query.setParameter("lDate", date);

		query.addScalar(ItemWithSaleDateDto.ITEM_ID, IntegerType.INSTANCE)
				.addScalar(ItemWithSaleDateDto.ITEM_NAME, StringType.INSTANCE)
				.addScalar(ItemWithSaleDateDto.SALE_DATE, LocalDateType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemWithSaleDateDto.class));

		List<ItemWithSaleDateDto> result = safeList(query);

		transaction.commit();

		return result;
	}

	
	public List<String> getBestSellerInYear (int year) {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();
		String sql = "SELECT mh.TenMH as TenMH "
				+ "FROM chitietdonhang ctdh\r\n"
				+ "JOIN mathang mh on mh.MaMH = ctdh.MaMh\r\n"
				+ "JOIN donhang dh on dh.MaDH = ctdh.MaDH\r\n"
				+ "WHERE year(cast(dh.NgayTao as Date)) = :year \n"
				+ " group by ctdh.MaMH order by sum(ctdh.SoLuong) desc limit 3";

		var query = session.createNativeQuery(sql);
		query.addScalar("TenMH", StringType.INSTANCE);
		query.setParameter("year", year);

		List<String> result = safeList(query);
		transaction.commit();

		return result;
	}

 	public List<Item> getAll () {
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();
		String sql = "SELECT * from MatHang";

		var query = session.createNativeQuery(sql, Item.class);

		var result = query.getResultList();

		transaction.commit();

		return result;
	}
}
