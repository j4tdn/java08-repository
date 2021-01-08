package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationProviderImpl implements ConfigurationProvider{

	public Properties getProperties() {
		Properties props = new Properties(); //doc toan bo thong tin ra class Properties
		try {
			File flie = new File("config.properties");
			props.load(new FileInputStream(flie));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}

}
