package PropertiesConcept;

import java.util.Properties;

public class AmazonTest {

	public static void main(String arg[])
	{
		PropReader reader=new PropReader();
		Properties prop=reader.initializeProperties();
		
		String browserName=prop.getProperty("browser");
		switch (browserName.toLowerCase().trim())
		{
		case "chrome":
			System.out.println("chrome is launching");			
			break;
		case "Firefox":
			System.out.println("chrome is launching");			
			break;
		case "opera":
			System.out.println("chrome is launching");			
			break;
		case "edge":
			System.out.println("chrome is launching");			
			break;

		default:
			System.out.println("plz pass the right browser");
			break;
		}
		
		System.out.println(prop.getProperty("url"));
		System.out.println("enter username:"+prop.getProperty("username"));
		System.out.println("enter password:"+prop.getProperty("password"));
		System.out.println("click on login button");
	}

}
