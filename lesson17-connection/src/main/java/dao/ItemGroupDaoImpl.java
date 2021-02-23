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

	@Override
	public List<ItemGroupDto> getListItemGroupDetail() {
		final String query = "SELECT lh.MaLoai AS " + ItemGroupDto.ITEM_GROUP_ID + ", \n"
				+ "	lh.TenLoai AS "+ ItemGroupDto.ITEM_GROUP_NAME +", \r\n"
				+ " GROUP_CONCAT(concat(mh.TenMH, ':', mh.SoLuong) SEPARATOR '-') AS "+ ItemGroupDto.ITEM_LIST+ ",\n"
				+ "sum(mh.SoLuong) AS " + ItemGroupDto.TOTAL_OF_ITEMS +"\n"
				+ "FROM MatHang mh \n"
				+ "JOIN LoaiHang lh ON mh.MaLoai = lh.MaLoai \n"
				+ "GROUP BY lh.MaLoai;";
		final List<ItemGroupDto> result = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()) {
				// transformer
				ItemGroupDto itemGroupDto = new ItemGroupDto();
				transformer(itemGroupDto);
				result.add(itemGroupDto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public List<ItemGroupDtoRaw> getListItemGroupDetailRaw() {
		final String query = "SELECT lh.MaLoai AS "+ ItemGroupDtoRaw.ITEM_GROUP_ID+", \r\n"
				+ "		lh.TenLoai AS " + ItemGroupDtoRaw.ITEM_GROUP_NAME + ", \r\n"
				+ "       mh.TenMH AS " + ItemGroupDtoRaw.ITEM_NAME+ ", \r\n"
				+ "       mh.SoLuong AS " + ItemGroupDtoRaw.NUMBER_OF_ITEMS+ "\r\n"
				+ "FROM MatHang mh\r\n"
				+ "join LoaiHang lh ON mh.MaLoai = lh.MaLoai\r\n"
				+ "";
		final List<ItemGroupDtoRaw> result = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()) {
				// transformer
				ItemGroupDtoRaw dtoRaw = new ItemGroupDtoRaw();
				transformerRaw(dtoRaw);
				result.add(dtoRaw);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	// transform sql's columns to object's attributes
	private void transformer(ItemGroupDto itemGroupDto) throws SQLException {
		itemGroupDto.setItemGroupId(rs.getInt(ItemGroupDto.ITEM_GROUP_ID));
		itemGroupDto.setItemGroupName(rs.getString(ItemGroupDto.ITEM_GROUP_NAME));
		itemGroupDto.setItemListTransformer(rs.getString(ItemGroupDto.ITEM_LIST));
		itemGroupDto.setItemGroupId(rs.getInt(ItemGroupDto.TOTAL_OF_ITEMS));
	}
	
	private void transformerRaw(ItemGroupDtoRaw itemGroupDto) throws SQLException {
		itemGroupDto.setItemGroupId(rs.getInt(ItemGroupDtoRaw.ITEM_GROUP_ID));
		itemGroupDto.setItemGroupName(rs.getString(ItemGroupDtoRaw.ITEM_GROUP_NAME));
		itemGroupDto.setItemName(rs.getString(ItemGroupDtoRaw.ITEM_NAME));
		itemGroupDto.setNumberOfItems(rs.getInt(ItemGroupDtoRaw.NUMBER_OF_ITEMS));
	}



}
