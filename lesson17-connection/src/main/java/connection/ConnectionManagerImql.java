package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManagerImql implements ConnectionManager {

	private ConfigurationProvider provider;
	public ConnectionManagerImql() {
		provider = new ConfigurationProviderImql();
}

	@Override
	public Connection getConnection() {
		Properties props = provider.getProperties();
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// Driver Provider
			connection = DriverManager.getConnection(props.getProperty("URL"), props.getProperty("NAME"), props.getProperty("PASSWORD"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) {
		ConnectionManager manager = new ConnectionManagerImql();
		System.out.println("conn : " + manager.getConnection());
	}
}
