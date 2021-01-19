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
import persistence.ItemGroupDto;
import persistence.ItemGroupDtoRaw;
import utils.SqlUtils;

public class ItemGroupDaoImpl implements ItemGroupDao {

	private final ConnectionManager connectionManager;
	private final Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public ItemGroupDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public ItemGroup getItem(Integer id) {
		ItemGroup result = null;
		final String query = "SELECT * FROM LoaiHang WHERE MaLoai = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public ItemGroup getItem(String name) {
		ItemGroup result = null;
		final String query = "SELECT * FROM LoaiHang WHERE TenLoai LIKE ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, "%" + name + "%");
			rs = pst.executeQuery();
			while (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public List<ItemGroupDto> getItemGroupDetail() {
		final List<ItemGroupDto> result = new ArrayList<>();
		final String query = "SELECT lh.MaLoai AS " + ItemGroupDto.ITEM_GROUP_ID + ",\n" + "		lh.TenLoai AS "
				+ ItemGroupDto.ITEM_GROUP_NAME + ",\n"
				+ "		GROUP_CONCAT(concat(mh.TenMH, ':', mh.SoLuong) SEPARATOR '-') " + ItemGroupDto.ITEM_LIST + ",\n"
				+ "		sum(mh.SoLuong) " + ItemGroupDto.TOTAL_OF_ITEMS + "\n" + "FROM MatHang mh\n"
				+ "JOIN LoaiHang lh ON mh.MaLoai = lh.MaLoai\n" + "GROUP BY lh.MaLoai";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				// transformer
				ItemGroupDto itemGroupDto = new ItemGroupDto();
				transformer(itemGroupDto);
				result.add(itemGroupDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	@Override
	public List<ItemGroupDtoRaw> getItemGroupDetailRawData() {
		final List<ItemGroupDtoRaw> result = new ArrayList<>();
		final String query = "SELECT lh.MaLoai AS " + ItemGroupDtoRaw.ITEM_GROUP_ID + ",\n" + "lh.TenLoai AS "
				+ ItemGroupDtoRaw.ITEM_GROUP_NAME + ",\n" + "mh.TenMH AS " + ItemGroupDtoRaw.ITEM_NAME + "\n"
				+ "		mh.SoLuong " + ItemGroupDtoRaw.NUMBER_OF_ITEMS + "\n"
				+ "		FROM MatHang mh JOIN LoaiHang lh ON mh.MaLoai = lh.MaLoai GROUP BY lh.MaLoai";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				// transformer
				ItemGroupDtoRaw itemGroupDtoRaw = new ItemGroupDtoRaw();
				transformer(itemGroupDtoRaw);
				result.add(itemGroupDtoRaw);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	// transform sql's columns to object's attributes
	private void transformer(ItemGroupDto itemGroupDto) throws SQLException {
		itemGroupDto.setItemGroupId(rs.getInt(ItemGroupDto.ITEM_GROUP_ID));
		itemGroupDto.setItemGroupName(rs.getString(ItemGroupDto.ITEM_GROUP_NAME));
		itemGroupDto.setItemListTransformer(rs.getString(ItemGroupDto.ITEM_LIST));
		itemGroupDto.setTotalOfItems(rs.getInt(ItemGroupDto.TOTAL_OF_ITEMS));
	}

	private void transformer(ItemGroupDtoRaw itemGroupDtoRaw) throws SQLException {
		itemGroupDtoRaw.setItemGroupId(rs.getInt(ItemGroupDtoRaw.ITEM_GROUP_ID));
		itemGroupDtoRaw.setItemGroupName(rs.getString(ItemGroupDtoRaw.ITEM_GROUP_NAME));
		itemGroupDtoRaw.setItemName(rs.getString(ItemGroupDtoRaw.ITEM_NAME));
		itemGroupDtoRaw.setNumberOfItems(rs.getInt(ItemGroupDtoRaw.NUMBER_OF_ITEMS));
	}

}
