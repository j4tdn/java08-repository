package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import entities.ItemGroup;
import utils.SqlUtils;

public class ItemGroupDaoImpl implements ItemGroupDao {

	private ConnectionManager connectionManager;
	private final Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;

	public ItemGroupDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConncetion();
	}

	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		final String query = "SELECT * FROM LoaiHang";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()) {
				ItemGroup itemGroup = new ItemGroup(rs.getInt("MaLoai"),rs.getString("TenLoai"));
				result.add(itemGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs);
		}
		return result;
	}

	@Override
	public ItemGroup get(Integer id) {
		ItemGroup result = null;
		final String query = "SELECT * FROM LoaiHang WHERE MaLoai = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			if(rs.next()) {
				result = new ItemGroup(rs.getInt("MaLoai"),rs.getString("TenLoai"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs);
		}
		return result;
	}
	
	@Override // unique
	public ItemGroup get(String name) {
		// prepareStatement
		// ?'s value is escaped
		ItemGroup result = null;
		final String query = "SELECT * FROM LoaiHang WHERE TenLoai = ?";
		
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, name);
			rs = pst.executeQuery();
			if(rs.next()) {
				result = new ItemGroup(rs.getInt("MaLoai"),rs.getString("TenLoai"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
}