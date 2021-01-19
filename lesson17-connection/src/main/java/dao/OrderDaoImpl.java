package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import utils.SqlUtils;

public class OrderDaoImpl implements OrderDao {

	private final ConnectionManager connectionManager;
	private final Connection conn;

	private PreparedStatement pst;

	public OrderDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}
	
	@Override
	public boolean update(int orderId) {
		int affectedRows = 0;
		final String query=" WITH CTE_TOTAL AS(\n"
				+ "	SELECT SUM(ctdh.SoLuong*mh.GiaBan) TongTien \n"
				+ "	FROM DonHang dh \n"
				+ "	JOIN ChiTietDonHang ctdh ON dh.madh = ctdh.madh \n"
				+ "	JOIN MatHang mh ON ctdh.mamh = mh.mamh\n"
				+ "	WHERE dh.MaDH = ?\n"
				+ ")\n"
				+ "UPDATE DonHang\n"
				+ "SET TongTien = (SELECT TongTien FROM CTE_TOTAL)\n"
				+ "WHERE MaDH = ?;                               ";
		try {
			pst=conn.prepareStatement(query);
			pst.setInt(1, orderId);
			pst.setInt(2, orderId);
			affectedRows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(pst);
		}
		return affectedRows > 0;
	}

}
