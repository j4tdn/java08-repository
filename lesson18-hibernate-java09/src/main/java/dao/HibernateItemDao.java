package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemDto;
import utils.HibernateUtils;

public class HibernateItemDao extends EntityDao implements ItemDao {


	private static final String Q_ITEMS_QTY_BY_GROUP = 
			"SELECT lh.MaLoai AS " + ItemDto.IGR_ID + ",\n" 
			+ "	   lh.TenLoai AS "+ ItemDto.IGR_NAME +",\n"  
			+ "       SUM(kcmh.SoLuong) AS "+ ItemDto.NOF_ITEMS +"\n"  
			+ "FROM LoaiHang lh\n" 
			+ "JOIN MatHang mh\n"  
			+ "	ON lh.MaLoai = mh.MaLoai\n"  
			+ "JOIN kichcomathang kcmh\n" 
			+ "	ON kcmh.MaMH = mh.MaMH\n" 
			+ "GROUP BY lh.MaLoai";
	
	public List<Item> getAll() {
		Session session = openSession();
		
		//native query 
		String sql = "SELECT * FROM MatHang"; //MaLoai, TenLoai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		return query.getResultList();
	}
	
	@Override
	public Item get(int id) {
		return openSession().get(Item.class, id);
	}

	@Override
	public List<ItemDto> getItemDtos() {
		Session session = openSession();
		NativeQuery<ItemDto> query = session.createNativeQuery(Q_ITEMS_QTY_BY_GROUP);
		
		query.addScalar(ItemDto.IGR_ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemDto.IGR_NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemDto.NOF_ITEMS, StandardBasicTypes.LONG);
		
		query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		return safeList(query);
	}

	@Override
	public void save(Item item) {
		openSession().saveOrUpdate(item);
	}
}