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
import connection.ConnectionManagerImpl;
import entities.Items;

public class ItemDaoImpl implements ItemDao {

	private final Connection conn;
	private final ConnectionManager connectionManager;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public ItemDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}

	@Override
	public List<Items> getItems(LocalDate saleDate) {
		List<Items> result = new ArrayList<Items>();
		final String query = "SELECT mh.MaMH AS " + Items.ID + ",\n"
								+	"mh.TenMH AS " + Items.NAME + ",\n"
								+	"mh.GiaBan AS " + Items.SALE_OUT + ",\n"
								+	"mh.SoLuong AS " + Items.QUANTITY + "\n"
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
				Items item = new Items();
				tranformer(item);
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	private void tranformer(Items item) throws SQLException {
		item.setItemId(rs.getInt(Items.ID));
		item.setItemName(rs.getString(Items.NAME));
		item.setSalesPrice(rs.getDouble(Items.SALE_OUT));
		item.setQuantity(rs.getInt(Items.QUANTITY));
		
	}

}
