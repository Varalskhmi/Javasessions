package StaticMethods;

public class Page {
	//public static void main[String args[]]- JVM -->Page.main();
	//caller method --user method
	//Not write business login in main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		Page.main(10);
		Page.main(1,3);
	}
	
	public static void main(int a)
	{
		System.out.println("hi"+a);		
	}
	public static void main(int a ,int b)

	{
		System.out.println("bye"+(a+b));
	}
}
