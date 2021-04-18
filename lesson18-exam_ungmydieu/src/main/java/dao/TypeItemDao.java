package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StringType;

import dto.ItemInSaleDateDto;
import dto.TypeItemDetailDto;
import dto.TypeItemDto;

public class TypeItemDao extends AbstractHibernateDao {
	public List<TypeItemDto> getTypeItemWithQuantity() {
		Session session = getCurrentSession();
		List<TypeItemDto> result = null;
				
		try {
			Transaction transaction = session.beginTransaction();
			String sql = "SELECT lh.MaLoai as " + TypeItemDto.TYPE_ITEM_ID +  ",\n"
					+ "lh.TenLoai as " + TypeItemDto.TYPE_ITEM_NAME + ",\n"
					+ "sum(mh.SoLuong) as " + TypeItemDto.TYPE_ITEM_QUANTITY + "\n" 
					+ "FROM LoaiHang lh\r\n" + 
					"JOIN MatHang mh ON mh.MaLoai = lh.MaLoai\r\n" + 
					"group by lh.MaLoai;";
					
			NativeQuery<?> query = session.createNativeQuery(sql);
			
			query.addScalar(TypeItemDto.TYPE_ITEM_ID, IntegerType.INSTANCE)
				.addScalar(TypeItemDto.TYPE_ITEM_NAME, StringType.INSTANCE)
				.addScalar(TypeItemDto.TYPE_ITEM_QUANTITY, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(TypeItemDto.class));
			
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return result;
	}
	
	public List<TypeItemDetailDto> getTypeItemDetail() {
		Session session = getCurrentSession();
		List<TypeItemDetailDto> result = null;
				
		try {
			Transaction transaction = session.beginTransaction();
			String sql = "SELECT lh.MaLoai as " + TypeItemDetailDto.TYPE_ID + ",\n "
					+ "lh.TenLoai as " + TypeItemDetailDto.TYPE_NAME + ",\n "
					+ "mh.MaMH as " + TypeItemDetailDto.ITEM_ID + ",\n"
					+ "mh.TenMH as " + TypeItemDetailDto.ITEM_NAME + ",\n "
					+ "mh.GiaBan as " + TypeItemDetailDto.SALE_PRICE + ",\n"
					+ "mh.GiaMua as " + TypeItemDetailDto.PURCHASE_PRICE + ",\n"
					+ "mh.SoLuong as " + TypeItemDetailDto.QUANTITY + "\n"
					+ "FROM LoaiHang lh \n"
					+ "JOIN MatHang mh ON lh.MaLoai = mh.MaLoai";
			
			NativeQuery<?> query = session.createNativeQuery(sql);
			
			query.addScalar(TypeItemDetailDto.TYPE_ID, IntegerType.INSTANCE)
				.addScalar(TypeItemDetailDto.TYPE_NAME, StringType.INSTANCE)
				.addScalar(TypeItemDetailDto.ITEM_ID, IntegerType.INSTANCE)
				.addScalar(TypeItemDetailDto.ITEM_NAME, StringType.INSTANCE)
				.addScalar(TypeItemDetailDto.SALE_PRICE, DoubleType.INSTANCE)
				.addScalar(TypeItemDetailDto.PURCHASE_PRICE, DoubleType.INSTANCE)
				.addScalar(TypeItemDetailDto.QUANTITY, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(TypeItemDetailDto.class));
			
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return result;
	}
}
