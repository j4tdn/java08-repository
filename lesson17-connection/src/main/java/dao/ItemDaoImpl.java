package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionManager;
import connection.ConnectionManagerlmpl;
import entities.Item;

public class ItemDaoImpl implements ItemDao{
	private final Connection conn;
	private final ConnectionManager connectionManager;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public ItemDaoImpl() {
		connectionManager = new ConnectionManagerlmpl();
		conn = connectionManager.getConnection();
	}

	public List<Item> getItems(LocalDate saleDate) {
		List<Item> result = new ArrayList<Item>();
		final String query = "SELECT mh.MaMH AS " + Item.ID + ",\n"
								+	"mh.TenMH AS " + Item.NAME + ",\n"
								+	"mh.GiaBan AS " + Item.SALE_OUT + ",\n"
								+	"mh.SoLuong AS " + Item.QUANTITY + "\n"
								+ "FROM MatHang mh\n" 
				+ "JOIN ChiTietDonHang ctdh\n"
				+ " ON mh.MaMH = ctdh.MaMH \n" 
				+ "JOIN DonHang dh\n"
				+ " ON dh.MaDH = ctdh.MaDH \n"
				+ "WHERE cast(dh.NgayTao as Date) = ?\n";
		try {
			pst = conn.prepareStatement(query);
			pst.setDate(1, java.sql.Date.valueOf(saleDate));
			rs = pst.executeQuery();
			while(rs.next()) {
				Item item = new Item();
				tranformer(item);
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	private void tranformer(Item item) throws SQLException {
		item.setItemId(rs.getInt(Item.ID));
		item.setItemName(rs.getString(Item.NAME));
		item.setSalesPrice(rs.getDouble(Item.SALE_OUT));
		item.setQuantity(rs.getInt(Item.QUANTITY));
		
	}

}
