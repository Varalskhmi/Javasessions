package PropertiesConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
	public final String CONFIG_FILE_PATH="./src/test/java/PropertiesConcept/config.properties";
	Properties prop;
	
	public Properties initializeProperties()
	{
		try {
			FileInputStream ip=new FileInputStream(CONFIG_FILE_PATH);
			prop=new Properties();
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return prop;
	}

}
