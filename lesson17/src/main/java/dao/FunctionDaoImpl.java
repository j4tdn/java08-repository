package dao;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import utils.SqlUtils;

import java.sql.*;

public class FunctionDaoImpl implements FunctionDao {

    private final ConnectionManager connectionManager;
    private final Connection conn ;
    private CallableStatement cst ;

    public FunctionDaoImpl(){
        connectionManager = new ConnectionManagerImpl();
        conn = connectionManager.getConnection();
    }

    @Override
    public int getSum(int number)  {
        // trong jdbc thi bat buoc phai dung lenh call
        // khi muon goi mot procedure va function thi phai dung call
        // chi procedure moi dung dc execute query hoac result set

        final String query = "{? = CALL F_GET_SUM_OF_ODD_DIGITS(?)}";

        int result = 0 ;

        try {
            cst = conn.prepareCall(query);
            cst.registerOutParameter(1, Types.INTEGER);
            cst.setInt(2,number);
            cst.execute();
            result = cst.getInt(1);
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            {
                SqlUtils.close(cst);
            }
        }
        return result ;
    }
}
