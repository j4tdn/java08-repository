package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import connection.ConnectionManager;
import connection.ConnectionManagerImpl;

public class FunctionDaoImpl implements FunctionDao{
	private final ConnectionManager connectionManager;
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	private CallableStatement cst;

	public FunctionDaoImpl() {
		connectionManager = new ConnectionManagerImpl();
		conn = connectionManager.getConnection();
	}


	@Override
	public int getSum(int number) {
		final String query = "{? = CALL F_SUM_OF_ODD_DIGITS(?)}";
		try {
			cst = conn.prepareCall(query);
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, number);
			cst.execute();
			
			return cst.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

}
