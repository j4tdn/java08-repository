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
import persistence.ItemGroupDTO;
import persistence.ItemGroupDTORaw;
import utils.SqlUtil;

public class ItemGroupDaoImpl implements ItemGroupDao {

	private final Connection conn;
	private final ConnectionManager connectionManager;
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
			SqlUtil.close(rs, st);
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
			System.out.println("rs :" + rs.getFetchSize());

			if (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtil.close(rs, st);
		}
		return result;
	}

	@Override
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
			SqlUtil.close(rs, st);
		}
		return result;
	}

	@Override
	public List<ItemGroupDTO> getItemGroupDetail() {
		final List<ItemGroupDTO> result = new ArrayList<ItemGroupDTO>();
		final String query = "SELECT lh.MaLoai AS " + ItemGroupDTO.ITEM_GROUP_ID + ",\n" + "lh.TenLoai AS "
				+ ItemGroupDTO.ITEM_GROUP_NAME + ",\n" + "group_concat(concat(mh.TenMH) separator '-' )  AS "
				+ ItemGroupDTO.ITEM_LIST + ",\n" + "sum(mh.SoLuong) AS " + ItemGroupDTO.TOTAL_OF_ITEM + "\n"
				+ "FROM MatHang mh \r\n" + "join LoaiHang lh on mh.MaLoai = lh.MaLoai\r\n" + " group by lh.MaLoai";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				// tranformer
				ItemGroupDTO itemGroupDTO = new ItemGroupDTO();
				tranformer(itemGroupDTO);
				result.add(itemGroupDTO);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public List<ItemGroupDTORaw> getItemGroupDetailRaw() {
		final List<ItemGroupDTORaw> result = new ArrayList<ItemGroupDTORaw>();
		final String query = "SELECT lh.MaLoai AS "+ ItemGroupDTORaw.ITEM_GROUP_ID  + ",\n"
								+ "mh.TenMH AS "+ ItemGroupDTORaw.ITEM_NAME 	    + ",\n"
								+ "mh.SoLuong AS "+ ItemGroupDTORaw.NUMBER_OF_ITEM  + ",\n" 
								+ "lh.TenLoai AS "+ ItemGroupDTORaw.ITEM_GROUP_NAME + "\n" 
								+ "FROM MatHang mh\n"
								+ "join LoaiHang lh on mh.MaLoai = lh.MaLoai";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				// tranformer
				ItemGroupDTORaw itemGroupDTORaw = new ItemGroupDTORaw();
				tranformer(itemGroupDTORaw);
				result.add(itemGroupDTORaw);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	private void tranformer(ItemGroupDTO itemGroupDTO) throws SQLException {
		itemGroupDTO.setItemGroupId(rs.getInt(ItemGroupDTO.ITEM_GROUP_ID));
		itemGroupDTO.setItemGroupName(rs.getString(ItemGroupDTO.ITEM_GROUP_NAME));
		itemGroupDTO.setItemListTranformer(rs.getString(ItemGroupDTO.ITEM_LIST));
		itemGroupDTO.setTotalOfItems(rs.getInt(ItemGroupDTO.TOTAL_OF_ITEM));
	}

	private void tranformer(ItemGroupDTORaw itemGroupDTORaw) throws SQLException {
		itemGroupDTORaw.setItemGroupId(rs.getInt(ItemGroupDTORaw.ITEM_GROUP_ID));
		itemGroupDTORaw.setItemGroupName(rs.getString(ItemGroupDTORaw.ITEM_GROUP_NAME));
		itemGroupDTORaw.setItemName(rs.getString(ItemGroupDTORaw.ITEM_NAME));
		itemGroupDTORaw.setNumberOfItems(rs.getInt(ItemGroupDTORaw.NUMBER_OF_ITEM));
	}

}