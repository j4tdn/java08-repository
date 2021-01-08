package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConfigurationProviderImql implements ConfigurationProvider {

	public Properties getProperties() {
		Properties props =new Properties();
		File file = new File("config.properties");
		try {
			props.load(new FileInputStream(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props;
		
	}
}