package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		//demo proxy
		Session session=getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try {
			Item item=session.get(Item.class, id);
			System.out.println("Item: "+item);
			transaction.commit();
		} catch (Exception e) {

		transaction.rollback();
		}
		return null;
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
		Session session = getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try {
			session.saveOrUpdate(item);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
	}

	@Override
	public Item getFirstLevelCache(int id) {
		Item item=null;
		Session sesion=getCurrentSession();
		Transaction transaction=sesion.beginTransaction();
		try {
			Item i1=sesion.get(Item.class, id);
			System.out.println("Item 1: "+i1);
			
			
			Item i2=sesion.get(Item.class, id);
			System.out.println("Item 2: "+i2);
			
			Item i3=sesion.get(Item.class, 2);
			System.out.println("Item 2: "+i3);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		return item;
	}

	@Override
	public Item getFirstLevelCacheInTwoSession(int id) {
		Session session =openSession();
		Session session1=openSession();
		
		Item i1=session.get(Item.class, id);
		System.out.println("Item 1: "+i1);
		
		Item i2=session1.get(Item.class, id);
		System.out.println("Item 2: "+i2);
		
		//clear cache 
		session1.evict(i2);
		//session.clear();
		
		// check whether is oject in persistence state
		
		session.contains(i2);
		
		Item i3=session1.get(Item.class, id);
		System.out.println("Item 3: "+i3);
		return null;
	}
	
	@Override
	public Item getSecondLevelCache(int id) {
		Session session =getCurrentSession();
		Session session1=getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try {
			Item i1=session.get(Item.class, id);
			System.out.println("Item 1: "+i1);
			
			Item i2=session1.get(Item.class, id);
			System.out.println("Item 2: "+i2);
			
			Item i3=session1.get(Item.class, id);
			System.out.println("Item 3: "+i3);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}
}