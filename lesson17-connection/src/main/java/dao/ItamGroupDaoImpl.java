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
import connection.ConnectionManagerlmpl;
import entities.ItemGroup;
import utils.SqlUtils;

public class ItamGroupDaoImpl implements ItemGroupDao {
	
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	private final ConnectionManager connectionManager;
	private final Connection conn;
	public ItamGroupDaoImpl() {
		connectionManager=new ConnectionManagerlmpl();
		conn=connectionManager.getConnection();
	}
	
	public List<ItemGroup> getAll() {
		List<ItemGroup> result=new ArrayList<ItemGroup>();
		final String query="SELECT * FROM LoaiHang";
		
		try {
			 st= conn.createStatement();
			 rs= st.executeQuery(query);
			while(rs.next()) {
				ItemGroup itemGroup=new ItemGroup(rs.getInt("MaLoai"),rs.getString("TenLoai"));
				result.add(itemGroup);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}

	public ItemGroup get(Integer id) {
		
		ItemGroup result=null;
		final String query="SELECT * FROM LoaiHang WHERE MaLoai="+id;
		
		try {
			 st= conn.createStatement();
			 rs= st.executeQuery(query);
			while(rs.next()) {
				result=new ItemGroup(rs.getInt("MaLoai"),rs.getString("TenLoai"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}

	public ItemGroup get(String name) {
		
		ItemGroup result=null;
		final String query="SELECT * FROM LoaiHang WHERE TenLoai LIKE ?";
// 		final String query="SELECT * FROM LoaiHang WHERE TenLoai LIKE ?";
		try {
			 pst=  conn.prepareStatement(query);
			 pst.setString(1,"%"+name+"%");
			 //pst.setString(1,name);
			 rs= pst.executeQuery();
			while(rs.next()) {
				result=new ItemGroup(rs.getInt("MaLoai"),rs.getString("TenLoai"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
}
