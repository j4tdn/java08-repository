package dao;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDaoImpl implements  OrderDao {


    private ConnectionManager connectionManager;

    private PreparedStatement preparedStatement;

    private static ResultSet rs;

    public OrderDaoImpl(){
        connectionManager = new ConnectionManagerImpl();
    }


    @Override
    public boolean update(int orderId) {
        int affectedRows = 0 ;
        final String query = "WITH CTE_TOTAL AS(\n" +
                "SELECT ctdh.MaDH, \n" +
                "group_concat(concat(mh.TenMH, ':', ctdh.SoLuong) separator ':') ChiTiet, \n" +
                "SUM(mh.GiaBan * ctdh.SoLuong) TongTien\n" +
                "FROM MatHang mh\n" +
                "JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH\n" +
                "Where ctdh.MaDH = ?)\n" +
                "UPDATE DonHang \n" +
                "SET TongTien = (SELECT TongTien FROM CTE_TOTAL)\n" +
                "WHERE MaDH = ?;";

        try {
            preparedStatement = connectionManager.getConnection().prepareStatement(query);
            preparedStatement.setInt(1,orderId);
            preparedStatement.setInt(2,orderId);
            affectedRows = preparedStatement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }

        return affectedRows > 0;
    }
}
