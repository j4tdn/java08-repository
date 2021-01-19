package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import utils.SqlUtils;

public class OrderDaoImpl implements OrderDao {
	private final ConnectionManager connectionManager;
	private final Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public OrderDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}

	@Override
	public boolean update(int orderId) {
		int affectedRow = 0;
		final String query = "WITH CTE_TOTAL AS (\n"
				+ "	SELECT ctdh.MaDH, GROUP_CONCAT(CONCAT(mh.TenMH, ':', ctdh.SoLuong) SEPARATOR ',') , sum(mh.GiaBan * ctdh.SoLuong) TongTien FROM mathang mh\n"
				+ "JOIN chitietdonhang ctdh ON ctdh.MaMH = mh.MaMH\n" + "WHERE ctdh.MaDH = ?)\n" + "UPDATE donhang\n"
				+ "SET TongTien = (SELECT TongTien FROM CTE_TOTAL)\n" + "WHERE MaDH = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, orderId);
			pst.setInt(2, orderId);
			affectedRow = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}

		return affectedRow > 0;
	}

}
