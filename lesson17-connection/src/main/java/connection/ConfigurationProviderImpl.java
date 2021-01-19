package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationProviderImpl implements ConfigurationProvider {

	public Properties getProperties() {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File("config.properties")));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props;
	}

}
