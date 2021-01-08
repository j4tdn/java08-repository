package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManagerImpl implements ConnectionManager {
	private ConfigurationProvider provider;
	
	public ConnectionManagerImpl() {
		provider = new ConfigurationProviderImpl();
	}
	
	@Override
	public Connection getConnection() {
		Properties props = provider.getPropertises();
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					props.getProperty("URL"), 
					props.getProperty("USER"), 
					props.getProperty("PASSWORD"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void main(String[] args) {
		ConnectionManager manager = new ConnectionManagerImpl();
		System.out.println("conn: " + manager.getConnection());
	}
}
