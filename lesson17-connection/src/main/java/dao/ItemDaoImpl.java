package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import entities.Item;
import utils.SqlUtils;

public class ItemDaoImpl implements ItemDao{
	
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
		final String query = "SELECT *\n"
				+ "FROM MatHang\n"
				+ "WHERE MaLoai = ?\n"
				+ "AND GiaBan BETWEEN ? AND ?";
		
		// todo: homework
		
		return Collections.emptyList();
	}
	
	@Override
	public List<Item> getItems(LocalDate salesDate) {
		List<Item> result = new ArrayList<>();
		final String query = "SELECT mh.MaMH     AS " + Item.ID         + ",\n"
						   + "       mh.TenMH    AS " + Item.NAME       + ",\n"
						   + "       mh.GiaBan   AS " + Item.SALES_OUT  + ",\n"
						   + "       mh.SoLuong  AS " + Item.QUANTITY   + " \n"
						   + "FROM MatHang mh\n"
						   + "JOIN ChiTietDonHang ctdh\n"
						   + "	ON mh.MaMH = ctdh.MaMH\n"
						   + "JOIN DonHang dh\n"
						   + "	ON dh.MaDH = ctdh.MaDH\n"
						   + "WHERE cast(dh.NgayTao as Date) = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setDate(1, java.sql.Date.valueOf(salesDate));
			rs = pst.executeQuery();
			while(rs.next()) {
				Item item = new Item();
				transformer(item);
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	private void transformer(Item item) throws SQLException{
		item.setId(rs.getInt(Item.ID));
		item.setName(rs.getString(Item.NAME));
		item.setSalesOut(rs.getDouble(Item.SALES_OUT));
		item.setQuantity(rs.getInt(Item.QUANTITY));
	}
	
}
