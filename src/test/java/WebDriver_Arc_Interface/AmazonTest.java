package WebDriver_Arc_Interface;

import ExceptionHandling.MyException;

public class AmazonTest {

	public static void main(String[] args) {
	
	//ChromeDriver driver=new ChromeDriver();
	
	//FirefoxDriver driver=new FirefoxDriver();
	
	//SafariDriver driver=new SafariDriver();
	
	String browserName="opera";
	WebDriver driver=null;
	switch (browserName.toLowerCase().trim()) {
	case "chrome":
		driver=new ChromeDriver();		
		break;
	case "firefox":
		driver=new FirefoxDriver();		
		break;
	case "safari":
		driver=new SafariDriver();		
		break;

	default:
		System.out.println("Please pass the right browsr");
		throw new MyException("Browser not found");
		
	}
	driver.get("https://www.amazon.com");
	String title=driver.getTitle();
	System.out.println("page title:"+title);
	
	if(title.equals("Amazon")) {
		System.out.println("title is correct");
			}
	else {
		System.out.println("title is not correct");
	}
	
	driver.findElement("amazon logo");
	driver.sendKeys("Email", "vara@gmail.com");
	driver.click("loginButton");
	driver.close();
	}

}
