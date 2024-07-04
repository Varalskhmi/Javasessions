package PropertiesConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readprop {
	public final static  String CONFIG_FILE_PATH="./src/test/java/PropertiesConcept/config.properties";
	static  Properties prop;
	public static void main(String[] args) {
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
	
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	
	String appURL=prop.getProperty("url");
	System.out.println(appURL);
	
	prop.setProperty("browser", "firefox");
	browserName=prop.getProperty("browser");
			System.out.println(browserName);
			
			
			prop.setProperty("version", "99.0");
			String versionName=prop.getProperty("version");
			System.out.println(versionName);
	}

}
