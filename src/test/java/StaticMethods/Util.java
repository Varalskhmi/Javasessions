package StaticMethods;

public class Util {
	String name;
	int age;
	static final String CompName="IBM";
	
	public void getInfo()
	{
		System.out.println("get Info");
	}
	public static void sendMail()
	{
		System.out.println("send mail");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Util u=new Util();
		
		//How to access non static variable and method:
		u.name="vara";
		u.age=32;
		u.getInfo();
		//How to access static variable and method-
		//Using class name we can access static variable
		
		System.out.println(Util.CompName);
		Util.sendMail();
		
		
	}

}
