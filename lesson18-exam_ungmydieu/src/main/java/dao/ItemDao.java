package dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StringType;

import dto.ItemInSaleDateDto;
import persistence.Item;

public class ItemDao extends AbstractHibernateDao {
	
	public List<ItemInSaleDateDto> getItemInSaleDate(LocalDate date) {
		Session session = getCurrentSession();
		List<ItemInSaleDateDto> result = null;
				
		try {
			Transaction transaction = session.beginTransaction();
			String sql = "SELECT mh.MaMH as " +ItemInSaleDateDto.ITEM_ID + ",\n" 
					+ "mh.TenMH as " + ItemInSaleDateDto.ITEM_Name + ",\n" 
					+ "cast(dh.NgayTao as Time) as " + ItemInSaleDateDto.ORDER_TIME + "\n"
					+ "FROM MatHang mh\r\n" 
					+ "JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH\r\n" 
					+ "JOIN DonHang dh ON ctdh.MaDH = dh.MaDH\r\n"  
					+ "WHERE cast(dh.NgayTao as Date) = :lDate";
					
			NativeQuery<?> query = session.createNativeQuery(sql);
			query.setParameter("lDate", date);
			
			query.addScalar(ItemInSaleDateDto.ITEM_ID, IntegerType.INSTANCE)
				.addScalar(ItemInSaleDateDto.ITEM_Name, StringType.INSTANCE)
				.addScalar(ItemInSaleDateDto.ORDER_TIME, LocalTimeType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemInSaleDateDto.class));
			
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return result;
	}
	
	public List<Item> getTopItemBestSale(Integer year) {
		Session session = getCurrentSession();
		List<Item> result = null;
				
		try {
			Transaction transaction = session.beginTransaction();
			String sql = "SELECT mh.MaMH as id, "
					+ "mh.TenMH as name "
					+ ", sum(ctdh.SoLuong) as quantity " 
					+ "FROM MatHang mh\r\n" + 
					"JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH\r\n" + 
					"JOIN DonHang dh ON ctdh.MaDH = dh.MaDH\r\n" + 
					"WHERE year(dh.NgayTao) = :year \r\n" + 
					"group by ctdh.MaMH\r\n" + 
					"order by quantity desc\r\n" + 
					"limit 3";
					
			NativeQuery<?> query = session.createNativeQuery(sql);
			query.addScalar("id", IntegerType.INSTANCE)
				.addScalar("name", StringType.INSTANCE)
				.addScalar("quantity", IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(Item.class));
			query.setParameter("year", year);
			
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return result;
	}

}
