package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;

public class OrderDaoImpl implements OrderDao {
	private final ConnectionManager connectionManager;
	private final Connection conn;
	private PreparedStatement pst;
	private ResultSet rs = null;
	
	public OrderDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}
	
	@Override
	public boolean update(int orderId) {
		int affectedRows = 0;
		final String query = 
				"WITH  CTE_TOTAL AS (SELECT ctdh.MaDH, \n" + 
				"	   group_concat(concat(mh.TenMH, ':', ctdh.SoLuong) SEPARATOR ', ') ChiTietDonHang,\n" + 
				"       SUM(mh.GiaBan * ctdh.SoLuong) TongTien\n" + 
				"FROM MatHang mh\n" + 
				"JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH\n" + 
				"WHERE ctdh.MaDh = ?)\n" + 
				"\n" + 
				"UPDATE DonHang SET TongTien = (SELECT cte.TongTien FROM CTE_TOTAL cte) \n" + 
				"WHERE MaDH = ?";
		
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, orderId);
			pst.setInt(2, orderId);
			affectedRows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return affectedRows > 0;
	}
}
