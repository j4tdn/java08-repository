package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManagerIml implements ConnectionManager {
	
    private ConfigurationProvider provider;
    
    public ConnectionManagerIml() {
	    provider = new ConfigurationProviderImp();
	}
	@Override
	public Connection getConnection() {
		Properties prop = provider.getProperties();
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("USER"), prop.getProperty("PASSWORD"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	public static void main(String[] args) {
		ConnectionManager manager = new ConnectionManagerIml();
		System.out.println("conn: " + manager.getConnection());
	}
	

}
