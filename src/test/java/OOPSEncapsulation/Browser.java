package OOPSEncapsulation;

public class Browser {
	
	public void launchBrowser()
	{
		System.out.println("Launching Browser.....");
		checkBrowserVersion();
		checkBrowserOSCompatibility();
		checkBrowserUpdates();
		checkBrowserLatestVersion();
		
		
	}
	public void checkBrowserVersion()
	{
		System.out.println("checking  Browser Version.....");
	}
	public void checkBrowserOSCompatibility()
	{
		System.out.println("checkBrowserOSCompatibilityr.....");
	}
	public void checkBrowserUpdates()
	{
		System.out.println("checkBrowserUpdates.....");
	}
	public void checkBrowserLatestVersion()
	{
		System.out.println("checkBrowserLatestVersion .....");
	}
	public void checkRAMSpace()
	{
		System.out.println("Check RAM Space .....");
	}
}
