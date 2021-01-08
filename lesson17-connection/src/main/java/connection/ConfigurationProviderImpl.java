package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationProviderImpl implements ConfigurationProvider{

	public Properties getProperties() {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File("config.properties")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}

}
