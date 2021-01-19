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
		int affectedRows = 0;
		final String query = "WITH CTE_TOTAL AS (\n"
				+ "	SELECT dh.MaDH,\n"
				+ "			group_concat(concat(mh.TenMH, ': ', ctdh.SoLuong) SEPARATOR ',') ChiTietDonHang,\n"
				+ "			SUM(mh.GiaBan * ctdh.SoLuong) TongTien\n"
				+ "	FROM chitietdonhang ctdh\n"
				+ "	INNER JOIN donhang dh ON dh.MaDH = ctdh.MaDH\n"
				+ "	INNER JOIN mathang mh on ctdh.MaMH = mh.MaMH\n"
				+ "	WHERE dh.MaDH = ?\n"
				+ ")\n"
				+ "UPDATE donhang\n"
				+ "SET TongTien = (SELECT TongTien FROM CTE_TOTAL)\n"
				+ "WHERE MaDH = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, orderId);
			pst.setInt(2, orderId);
			affectedRows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		return affectedRows > 0;
	}

}
