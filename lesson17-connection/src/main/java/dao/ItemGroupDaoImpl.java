package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionManager;
import connection.ConnectionManagerlmpl;
import entities.ItemGroup;
import persstence.ItemGroupDto;
import persstence.ItemGroupDtoRaw;
import utils.SqlUtils;


public class ItemGroupDaoImpl implements ItemGroupDao {

	private final Connection conn;
	private final ConnectionManager connectionManager;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public ItemGroupDaoImpl() {
		connectionManager = new ConnectionManagerlmpl();
		conn = connectionManager.getConnection();
	}

	
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		final String query = "SELECT * FROM LoaiHang";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			System.out.println("rs :" + rs.getFetchSize());

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


	public ItemGroup get(Integer id) {
		ItemGroup result = null;
		final String query = "SELECT * FROM LoaiHang WHERE MaLoai = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			System.out.println("rs :" + rs.getFetchSize());

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

	
	public ItemGroup get(String name) {
		ItemGroup result = null;
		final String query = "SELECT * FROM LoaiHang WHERE TenLoai=?";

		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, name);
			rs = pst.executeQuery();
			System.out.println("rs :" + rs.getFetchSize());

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


	public List<ItemGroupDto> getItemGroupDetail() {
		final List<ItemGroupDto> result = new ArrayList<ItemGroupDto>();
		final String query = "SELECT lh.MaLoai AS " + ItemGroupDto.ITEM_GROUP_ID + ",\n" + "lh.TenLoai AS "
				+ ItemGroupDto.ITEM_GROUP_NAME + ",\n" + "group_concat(concat(mh.TenMH) separator '-' )  AS "
				+ ItemGroupDto.ITEM_LIST + ",\n" + "sum(mh.SoLuong) AS " + ItemGroupDto.TOTAL_OF_ITEM + "\n"
				+ "FROM MatHang mh \r\n" + "join LoaiHang lh on mh.MaLoai = lh.MaLoai\r\n" + " group by lh.MaLoai";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				// tranformer
				ItemGroupDto itemGroupDTO = new ItemGroupDto();
				tranformer(itemGroupDTO);
				result.add(itemGroupDTO);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	
	public List<ItemGroupDtoRaw> getItemGroupDetailRawData() {
		final List<ItemGroupDtoRaw> result = new ArrayList<ItemGroupDtoRaw>();
		final String query = "SELECT lh.MaLoai AS "+ ItemGroupDtoRaw.ITEM_GROUP_ID  + ",\n"
								+ "mh.TenMH AS "+ ItemGroupDtoRaw.ITEM_NAME 	    + ",\n"
								+ "mh.SoLuong AS "+ ItemGroupDtoRaw.NUMBER_OF_ITEM  + ",\n" 
								+ "lh.TenLoai AS "+ ItemGroupDtoRaw.ITEM_GROUP_NAME + "\n" 
								+ "FROM MatHang mh\n"
								+ "join LoaiHang lh on mh.MaLoai = lh.MaLoai";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				// tranformer
				ItemGroupDtoRaw itemGroupDTORaw = new ItemGroupDtoRaw();
				tranformer(itemGroupDTORaw);
				result.add(itemGroupDTORaw);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	private void tranformer(ItemGroupDto itemGroupDTO) throws SQLException {
		itemGroupDTO.setItemGroupId(rs.getInt(ItemGroupDto.ITEM_GROUP_ID));
		itemGroupDTO.setItemGroupName(rs.getString(ItemGroupDto.ITEM_GROUP_NAME));
		itemGroupDTO.setItemListTranformer(rs.getString(ItemGroupDto.ITEM_LIST));
		itemGroupDTO.setTotalOfItems(rs.getInt(ItemGroupDto.TOTAL_OF_ITEM));
	}

	private void tranformer(ItemGroupDtoRaw itemGroupDTORaw) throws SQLException {
		itemGroupDTORaw.setItemGroupId(rs.getInt(ItemGroupDtoRaw.ITEM_GROUP_ID));
		itemGroupDTORaw.setItemGroupName(rs.getString(ItemGroupDtoRaw.ITEM_GROUP_NAME));
		itemGroupDTORaw.setItemName(rs.getString(ItemGroupDtoRaw.ITEM_NAME));
		itemGroupDTORaw.setNumberOfItems(rs.getInt(ItemGroupDtoRaw.NUMBER_OF_ITEM));
	}


	

}