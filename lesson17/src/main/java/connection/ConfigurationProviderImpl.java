package connection;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationProviderImpl implements ConfigurationProvider {

	public Properties getProperties() {
		Properties props = new Properties();
		File file = new File("config.properties");
		try {
			props.load(new FileInputStream(file));
		} catch (Exception e) {
		}
		return props;
	}

}
