package dao;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import entities.Item;
import utils.SqlUtils;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {

    private ConnectionManager connectionManager;

    private PreparedStatement preparedStatement;

    private static ResultSet  rs;

    public ItemDaoImpl(){
        connectionManager = new ConnectionManagerImpl();
    }


    @Override
    public List<Item> getItems(int itemGroupId, double saleFrom, double saleTo) {
        final String query = "SELECT *\n"
                            +"FROM Mathang\n"
                            +"WHERE MaLoai = ?\n"
                            +"AND Giaban BETWEEN ? and ?";

        // to do : home
        return null;
    }

    @Override
    public List<Item> getItems(LocalDate salesDate)   {

        List<Item> itemList = new ArrayList<>();


        // tao cau query xong roi query
        final String query = "SELECT mh.MaMH AS "+ Item.ID+",\n"
                                +"mh.TenMH AS " + Item.NAME + ",\n"
                                +"mh.GiaBan AS " + Item.SALES_OUT + ",\n"
                                +"mh.SoLuong AS " + Item.QUATITY + "\n"
                            +"FROM mathang mh\n"
                            +"join chitietdonhang ctdh on mh.MaMH = ctdh.MaMH\n"
                            +"join donhang dh on ctdh.MaDH = dh.MaDH\n"
                            +"where cast(dh.NgayTao as Date) = ? "+";";

        try {
            preparedStatement = this.connectionManager.getConnection().prepareStatement(query);
            preparedStatement.setDate(1, java.sql.Date.valueOf(salesDate));
             this.rs = preparedStatement.executeQuery();
            while(rs.next()){
                Item item = new Item();

                transformer(item);

                itemList.add(item);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            SqlUtils.close(preparedStatement);
        }

        return itemList;
    }

    private static void transformer(Item item){
        try {
            item.setId(rs.getInt(Item.ID));
            item.setName(rs.getString(Item.NAME));
            item.setBuyPrice(rs.getDouble(Item.SALES_OUT));
            item.setQty(rs.getInt(Item.QUATITY));
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
