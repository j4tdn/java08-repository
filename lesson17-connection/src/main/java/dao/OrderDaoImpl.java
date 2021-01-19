package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;

public class OrderDaoImpl implements OrderDao {

	private final Connection conn;
	private final ConnectionManager connectionManager;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public OrderDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}

	@Override
	public boolean update(int orderId) {
		int affectedRows = 0;
		final String query = "WITH CTE_TOTAL AS(\r\n" + "SELECT ctdh.MaDH, \r\n"
				+ "group_concat(concat(mh.TenMH, ':', ctdh.SoLuong) separator ':') ChiTiet, \r\n"
				+ "SUM(mh.GiaBan * ctdh.SoLuong) TongTien\r\n" + "FROM MatHang mh\r\n"
				+ "JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH\r\n" + "Where ctdh.MaDH = ?)\r\n"
				+ "UPDATE DonHang \r\n" + "SET TongTien = (SELECT TongTien FROM CTE_TOTAL)\r\n" + "WHERE MaDH = ?";

		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, orderId);
			pst.setInt(2, orderId);
			affectedRows = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return affectedRows > 0;
	}

}
