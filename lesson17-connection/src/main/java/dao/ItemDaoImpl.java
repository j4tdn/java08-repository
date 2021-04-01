package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.transform.Transformer;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import entities.Item;
import persistence.ItemGroupDTO;
import utils.SqlUtils;

public class ItemDaoImpl implements ItemDao  {
	
	private final Connection conn;
	private final ConnectionManager connectionManager;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public ItemDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}
	
	@Override
	public List<Item> getItem(int itemGroupId, double saleFrom, double saleTo) {
		// SELECT * FROM 
		final String query = "SELECT *"
				+ "\n FROM MatHang"
				+ "\n WHERE MaLoai = ?"
				+ "\nAND GiaBan BETWEEN ? AND ?";
		
		//todo: homework
		
		return Collections.EMPTY_LIST;
	}

	@Override
	public List<Item> getItems(LocalDate salesDate) {
		List<Item> result = new ArrayList<>();
		// TODO Auto-generated method stub
		final String query = "SELECT mh.MaMH AS " + Item.ID 		+ ",\n"
				+ "                  mh.TenMH AS " + Item.NAME		+ ",\n"
				+ "                  mh.GiaBan AS " + Item.SALES_OUT+ ",\n"
				+ "                  mh.SoLuong AS " + Item.QUANTITY+ "\n"
				+ "FROM MatHang mh\n"
				+ "JOIN ChiTietDonHang ctdh\n"
				+ "ON mh.MaMH = ctdh.MaMH\n"
				+ "JOIN DonHang dh\n"
				+ "ON dh.MaDH = ctdh.MaDH\n"
				+ "WHERE cast(dh.NgayTao as Date) = ?";
		
		try {
			pst = conn.prepareStatement(query);
			pst.setDate(1, java.sql.Date.valueOf(salesDate));
			rs = pst.executeQuery();
			
			while(rs.next()) {
				Item item = new Item();
				transformer(item);
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	//transfrom sql's return to obj's attributes
	private void transformer (Item item) throws SQLException {
		item.setId(rs.getInt(Item.ID)); //lay column trong resultSet map sang 
		item.setName(rs.getString(Item.NAME));
		item.setPriceBuy(rs.getDouble(Item.SALES_OUT));
		item.setQuantity(rs.getInt(Item.QUANTITY));
		
	}

//	@Override
//	public List<ItemGroupDTO> getItemGroupDetail() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
