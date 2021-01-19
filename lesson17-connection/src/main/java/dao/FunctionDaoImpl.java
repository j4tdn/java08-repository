package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import utils.SqlUtils;

public class FunctionDaoImpl implements FunctionDao {
	
	private final ConnectionManager connectionManager;
	private final Connection conn;
	private CallableStatement cst;
	private PreparedStatement pst;
	private ResultSet rs;

	public FunctionDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}

	@Override
	public int getSum(int number) {
		int result = 0;
		final String query = "{? = CALL F_SUM_OF_ODD_DIGITS(?)}";
//		final String query = "SELECT F_SUM_OF_ODD_DIGITS(?) AS Sum";
		try {
			cst = conn.prepareCall(query);
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, number);
			cst.execute();
			result = cst.getInt(1);
			
//			pst = conn.prepareStatement(query);
//			pst.setInt(1, number);
//			rs = pst.executeQuery();
//			while (rs.next()) {
//				result = rs.getInt("Sum");
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(cst);
		}
		return result;
	}

}
