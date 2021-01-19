package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import entities.Item;
import utils.SqlUtil;

public class ItemDaoImpl implements ItemDao {
	
	private final ConnectionManager connectionManager;
	private final Connection conn;
	
	private PreparedStatement pst;
	private ResultSet rs;
	
	public ItemDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}
	
	
	@Override
	public List<Item> getItems(int itemGroupId, double saleFrom, double saleTo) {
		List<Item> result	= new ArrayList<>();
		final String query = "SELECT * \n"
				+"FROM MatHang \n"
				+"WHERE MaLoai = ? \n"
				+"AND GiaBan BETWEEN ? AND ?";
		
		
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, itemGroupId);
			pst.setDouble(2, saleFrom);
			pst.setDouble(3, saleTo);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				Item listItem = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaBan"), rs.getInt("SoLuong"));
				result.add(listItem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtil.close(rs, pst);
			
		}
		
		return result;
	}


	@Override
	public List<Item> getItems(LocalDate salesDate) {
		List<Item> result = new ArrayList<>();
		final String query = "SELECT mh.MaMH AS "   + Item.ID + ",\n" 
				+					"mh.TenMH AS "  + Item.NAME + ",\n" 
				+					"mh.GiaBan AS " + Item.SALES + ",\n" 
				+					"mh.SoLuong AS "+ Item.QUANTITY + "\n" 
				+ "    FROM MATHANG mh \n"  
				+ "    JOIN CHITIETDONHANG ctdh ON mh.MaMH = ctdh.MaMH\n" 
				+ "    JOIN DONHANG dh ON ctdh.MaDH = dh.MaDH\n"  
				+ "    WHERE  cast(dh.NgayTao AS DATE) = ? \n" ;
		try {
			pst =conn.prepareStatement(query);
			pst.setDate(1, java.sql.Date.valueOf(salesDate) );
			rs = pst.executeQuery();
			while(rs.next()) {
				Item item	= new Item();
				transformer(item);
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtil.close(rs, pst);
			
		}		
		return result;
	}


	private void transformer(Item item) throws SQLException {
		item.setId(rs.getInt(Item.ID));
		item.setName(rs.getString(Item.NAME));
		item.setSale(rs.getDouble(Item.SALES));
		item.setQuantity(rs.getInt(Item.QUANTITY));
		
	}


	
	


}
