package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigrtionProviderImpl implements configrationProvider {

	@Override
	public Properties getProperties() {
		Properties props = new Properties();
		try {
			File file = new File("config.properties");
			props.load(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props;
	}

}
