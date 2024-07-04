package Functions;

public class Browser {

	//Write a function
	// WAF:
		// launch a browser : browserName(String) -- input param : chrome/ff/safari/edge
		// return : boolean : true/false
	
	public boolean launchAppBrowser(String browserName)
	{
		System.out.println("Launching broeser____"+browserName);
		boolean flag=true;
	switch (browserName) {
	case "chrome":
		System.out.println("chrome is launched");
		//return true;
		break;
	case "firefox":
		System.out.println("firefox is launched");
		//return true;
		break;
	case "safari":
		System.out.println("safari is launched");
		//return true;
		break;
	case "edge":
		System.out.println("edge is launched");
		//return true;
		break;
	default:
		System.out.println("Plz passs the right browser for switch case");
		//return false;
		flag=false;
		break;
	}
	return flag;
	}
	
	//Student marks use case
	public int getStudentMarks(String studentName)
	{
		System.out.println("getting student marks:"+studentName);
		
		int marks=-1;
		switch (studentName.trim().toLowerCase()) //Arti---arti{
		case "arti":
			marks=90;
			break;
		case "ravi":
			marks=80;
			break;
		case "pothana":
			marks=70;
			break;
		case "vara":
			marks=60;
			break;
		default:
			System.out.println("plz pass the right student name");
			break;
		}
		return marks;
	}
	public boolean launchBrowser(String browserName)
	{
		System.out.println("launching browser-----:"+browserName);
		
		if(browserName.equals("chrome"))
		{
			System.out.println("chrome is launched");
			return true;
		}
		else if(browserName.equals("Firefox"))
		{
			System.out.println("firefox is launched--");
			return true;
		}
		else if(browserName.equals("edge"))
		{
			System.out.println("edge is launched--");
			return true;
		}
		else if(browserName.equals("safari"))
		{
			System.out.println("safari is launched--");
			return true;
		}
		else {
			System.out.println("plz pass the rigth browser");
			return false;
		}
	}
	
	public static void main(String[] args) {
		Browser br=new Browser();
		int m1=br.getStudentMarks("arti");
		System.out.println(m1);
		if(m1>=0 && m1<=100)
		{
			System.out.println("print the marksheet");
		}
		
		int m2=br.getStudentMarks("pothana");
		System.out.println(m2);
		if(m2>=0 && m2<=100)
		{
			System.out.println("print the marksheet");
		}
		int m3=br.getStudentMarks("Tom");
		System.out.println(m3);
		if(m3>=0 && m3<=100)
		{
			System.out.println("print the marksheet");
		}
		
		
		
		
		//switch case code
//		if(br.launchAppBrowser("safari"))
//		{
//			System.out.println("enter url:https://google.com");
//		}
//		else {
//			System.out.println("No nedd to enter URL");
//		}
		
		
//		if else calling method
//		boolean flag=br.launchBrowser("ie");
//		System.out.println(flag);
//		if(flag)
//		{
//			System.out.println("enter url:https://google.com");
//		}
//		else {
//			System.out.println("No nedd to enter URL");
//		}
		
		
		
	}

}
