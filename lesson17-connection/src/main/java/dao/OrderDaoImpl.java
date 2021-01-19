package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import utils.SqlUtil;

public class OrderDaoImpl implements OrderDao {
	
	private final ConnectionManager connectionManager;
	private final Connection conn;
	
	private PreparedStatement pst;
	private ResultSet rs;
	
	public OrderDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}

	@Override
	public boolean update(int orderId) {
		int affectedRows= 0;
		
		final String query = " WITH CTE_TOTAL AS(\n" + 
				" SELECT ctdh.MaDH,\n" + 
				"		group_concat(concat(mh.TenMH, ':' , ctdh.SoLuong) SEPARATOR ' , ') ChiTiet,\n" + 
				"		SUM(mh.GiaBan * ctdh.SoLuong) TongTien\n" + 
				"  FROM MatHang mh\n" + 
				"  JOIN ChitietDonHang ctdh ON mh.MaMH = ctdh.MaMH\n" + 
				"   WHERE ctdh.MaDH =?\n" + 
				")  \n" + 
				"  UPDATE DonHang dh\n" + 
				"  SET dh.TongTien = (SELECT cte.TongTien \n" + 
				"					FROM CTE_ToTal cte\n" + 
				"                   )\n" + 
				"  WHERE MaDH = ? ";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, orderId);
			pst.setInt(2, orderId);
			affectedRows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.close(rs, pst);
		}
		
		return affectedRows > 0 ;
	}


	
}
