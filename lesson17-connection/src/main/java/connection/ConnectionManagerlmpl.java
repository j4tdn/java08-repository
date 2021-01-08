package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManagerlmpl implements ConnectionManager {

	private ConfigurationProvider provider;
	public ConnectionManagerlmpl() {
		provider=new ConfigurationProviderlmpl();
	}

	public Connection getConnection() {
		Properties props=provider.getProperties();
		// driver provider
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(props.getProperty("URL"), props.getProperty("USER"), props.getProperty("PASSWORD"));
		} catch (Exception e) {

			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) {
		ConnectionManager cnn = new ConnectionManagerlmpl();
		System.out.println("cnn :" + cnn.getConnection());
	}
}
