package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import entities.ItemGroup;
import utils.SqlUtils;

public class ItemGroupDaoImpl implements ItemGroupDao {

	private final ConnectionManager connectionManager;
	private Connection conn;
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;

	public ItemGroupDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}

	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		final String query = "SELECT * FROM LoaiHang";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				var itemGroup = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
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
	public ItemGroup getById(Integer id) {
		ItemGroup result = new ItemGroup();
		final String query = "SELECT * FROM LoaiHang WHERE MaLoai = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
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

	@Override
	public ItemGroup getByName(String name) {
		ItemGroup result = new ItemGroup();
		final String query = "SELECT * FROM LoaiHang WHERE TenLoai LIKE ?";
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, "%" + name + "%");
			rs = ps.executeQuery();
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
