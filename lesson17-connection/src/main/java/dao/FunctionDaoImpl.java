package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;

import com.mysql.cj.jdbc.CallableStatement;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;
import utils.SqlUtils;

public class FunctionDaoImpl implements FunctionDao {
	private final ConnectionManager connectionManager;
	private final Connection conn;
	private java.sql.CallableStatement cst;

	public FunctionDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}

	@Override
	public int getSum(int number) {
		int result = 0;
		final String query = "{? = CALL F_SUM_OF_ODD_DIGITS(?)}";

		try {
			cst = conn.prepareCall(query);
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, number);
			cst.execute();
			result = cst.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(cst);
		}

		return result;
	}

}
