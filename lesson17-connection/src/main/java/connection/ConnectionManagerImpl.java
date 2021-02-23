package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionManagerImpl implements ConnectionManager {
	private ConfigurationProvider provider;
	
	public ConnectionManagerImpl() {
		provider = new ConfigurationProviderImpl();
	}

	public Connection getConnection() {
		var props = provider.getProperties();
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(props.getProperty("URL"), props.getProperty("USER"), props.getProperty("PASSWORD"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
	
}
