package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import entities.Item;
import utils.SqlUtils;

public class ItemDaoImpl implements ItemDao{
	private final ConnectionManager connectionManager;
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public ItemDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}

	@Override
	public List<Item> getItems(int itemGroupId, double saleFrom, double saleTo) {
		final String query = "SELECT * FROM MatHang\n"
				+ "WHERE MaLoai = ?\n"
				+ "AND GiaBan Between ? AND ?";
		return null;
	}

	@Override
	public List<Item> getItems(LocalDate salesDate) {
		final String query = "SELECT mh.MaMH AS "+ Item.ID  + ", "
				+ " 	mh.TenMH AS " +  Item.NAME + " , "
				+ " 	mh.GiaBan AS " +  Item.SALES_OUT + " , "
				+ " 	mh.SoLuong AS " +  Item.QUANTITY + "  "
				+ "FROM mathang mh \r\n"
				+ "JOIN chitietdonhang ctdh \r\n"
				+ "on mh.MaMH = ctdh.MaMH\r\n"
				+ "JOIN DonHang dh \r\n"
				+ "on ctdh.MaDH = dh.MaDH\r\n"
				+ "WHERE cast(dh.NgayTao as Date) = ?";
		List<Item> result = new ArrayList<>();
		try {
			pst = conn.prepareStatement(query);
			pst.setDate(1, Date.valueOf(salesDate));
			rs = pst.executeQuery();
			
			while(rs.next()) {
				Item item =new Item();
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
	
	private void transformer(Item item) throws SQLException {
		item.setId(rs.getInt(Item.ID));
		item.setName(rs.getString(Item.NAME));
		item.setQuantity(rs.getInt(Item.QUANTITY));
		item.setSalesOut(rs.getDouble(Item.SALES_OUT));
	}

}
