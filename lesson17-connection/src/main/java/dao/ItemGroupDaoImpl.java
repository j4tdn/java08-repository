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

	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		final String query = "SELECT * FROM LOAIHANG";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				result.add(new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	public ItemGroup get(Integer id) {
		ItemGroup result = null;
		final String query = "SELECT * FROM LOAIHANG WHERE MaLoai = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			if (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	public ItemGroup get(String name) {
		ItemGroup result = null;
		final String query = "SELECT * FROM LOAIHANG WHERE TenLoai LIKE ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, "%" + name + "%");
			rs = pst.executeQuery();
			if (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}

	public List<ItemGroupDto> getItemGroupDetail() {
		List<ItemGroupDto> itemGroupDtos = new ArrayList<ItemGroupDto>();
		final String query = "SELECT mh.MaLoai AS " + ItemGroupDto.ITEM_GROUP_ID + ", \r\n" + " lh.TenLoai "
				+ ItemGroupDto.ITEM_GROUP_NAME + ", \r\n"
				+ "	group_concat(concat(mh.TenMH, ':', mh.SoLuong) SEPARATOR '-') " + ItemGroupDto.ITEM_LIST
				+ " ,\r\n" + "		 SUM(mh.SoLuong) " + ItemGroupDto.TOTAL_OF_ITEMS + " \r\n" + " FROM MatHang mh\r\n"
				+ "JOIN LoaiHang lh ON lh.MaLoai = mh.MaLoai\r\n" + "GROUP BY mh.MaLoai";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				ItemGroupDto itemGroupDto = new ItemGroupDto();
				tranfomer(itemGroupDto);
				itemGroupDtos.add(itemGroupDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return itemGroupDtos;
	}

	public List<ItemGroupDtoRaw> getItemGroupDetailRawData() {
		List<ItemGroupDtoRaw> itemGroupDtoRaws = new ArrayList<ItemGroupDtoRaw>();
		final String query = "SELECT mh.MaLoai AS " + ItemGroupDtoRaw.ITEM_GROUP_ID + ", \r\n" 
				+ " lh.TenLoai " + ItemGroupDtoRaw.ITEM_GROUP_NAME + ", \r\n" + "	mh.TenMH " + ItemGroupDtoRaw.ITEM_NAME
				+ " , mh.SoLuong " + ItemGroupDtoRaw.NUMBER_OF_ITEMS +" \r\n" + " FROM MatHang mh\r\n"
				+ "JOIN LoaiHang lh ON lh.MaLoai = mh.MaLoai\r\n";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				ItemGroupDtoRaw itemGroupDtoRaw = new ItemGroupDtoRaw();
				tranfomer(itemGroupDtoRaw);
				itemGroupDtoRaws.add(itemGroupDtoRaw);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return itemGroupDtoRaws;
	}

	private void tranfomer(ItemGroupDto itemGroupDto) throws SQLException {
		itemGroupDto.setItemGroupId(rs.getInt(ItemGroupDto.ITEM_GROUP_ID));
		itemGroupDto.setItemGroupName(rs.getString(ItemGroupDto.ITEM_GROUP_NAME));
		itemGroupDto.setItemListTranformer(rs.getString(ItemGroupDto.ITEM_LIST));
		itemGroupDto.setTotalOfItems(rs.getInt(ItemGroupDto.TOTAL_OF_ITEMS));
	}

	private void tranfomer(ItemGroupDtoRaw itemGroupDtoRaw) throws SQLException {
		itemGroupDtoRaw.setItemGroupId(rs.getInt(ItemGroupDtoRaw.ITEM_GROUP_ID));
		itemGroupDtoRaw.setItemGroupName(rs.getString(ItemGroupDtoRaw.ITEM_GROUP_NAME));
		itemGroupDtoRaw.setItemName(rs.getString(ItemGroupDtoRaw.ITEM_NAME));
		itemGroupDtoRaw.setNumberOfItems(rs.getInt(ItemGroupDtoRaw.NUMBER_OF_ITEMS));
	}

}
