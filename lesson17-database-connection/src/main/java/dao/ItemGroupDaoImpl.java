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
	
	private final ConnectionManager connectionManager;
	private final Connection conn;
	private Statement st = null;
	private PreparedStatement pst;
	private ResultSet rs = null;
	
	public ItemGroupDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();	
	}
	
	// SELECT
	// DELETE UPDATE INSERT
	
	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		final String query = "SELECT * FROM LoaiHang";
		Statement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				ItemGroup itemGroup = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(itemGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	@Override
	public ItemGroup get(Integer id) {
		ItemGroup result = null;
		final String query = "SELECT * FROM LoaiHang WHERE MaLoai = " + id ;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return result;
	}
	
	@Override
	public ItemGroup get(String name) {
		// prepare_statement => Avoid SQL injection
		// ?'s value is escaped => script, sql ==> string
		ItemGroup result = null;
		final String query = "SELECT * FROM LoaiHang WHERE TenLoai LIKE ?";	
		
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, "%" + name + "%");			
			rs = pst.executeQuery();
			if (rs.next()) {				
				result = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return result;
	}
}
