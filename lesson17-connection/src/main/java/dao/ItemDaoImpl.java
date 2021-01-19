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
import utils.SqlUtils;

public class ItemDaoImpl implements ItemDao {

	private final ConnectionManager connectionManager;
	private final Connection conn;
	private final ItemGroupDao itemGroupDao;

	// private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public ItemDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
		itemGroupDao = new ItemGroupDaoImpl();
	}

	@Override
	public List<Item> getItems(LocalDate date) {
		List<Item> result = new ArrayList<Item>();
		final String query = "SELECT MaMH  " + Item.ID + ", TenMH " + Item.NAME + ", GiaBan " + Item.SALES_OUT
				+ ", SoLuong " + Item.QUANTITY + "\n" 
				+ "FROM MatHang \n" 
				+ "WHERE MaMH IN ( SELECT mamh \n"
				+ "			       FROM ChiTietDonHang \n" 
				+ "			       WHERE MaDH IN ( SELECT MaDH \n"
				+ "							       FROM DonHang \n"
				+ "                                WHERE CAST(Ngaytao as Date) = ?))";
		try {
			pst = conn.prepareStatement(query);
			pst.setDate(1, java.sql.Date.valueOf(date));
			rs = pst.executeQuery();
			while (rs.next()) {
				Item item = new Item();
				transformer(item);
				result.add(item);
//				result.add(new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getString("Size"),
//						rs.getDouble("GiaMua"), rs.getDouble("GiaBan"), rs.getInt("SoLuong"), rs.getString("MauSac"),
//						itemGroupDao.get(rs.getInt("MaLoai"))));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}

	private void transformer(Item item) throws SQLException {
		item.setId(rs.getInt(Item.ID));
		item.setName(rs.getString(Item.NAME));
		item.setSalesOut(rs.getDouble(Item.SALES_OUT));
		item.setQuantity(rs.getInt(Item.QUANTITY));
	}

}
