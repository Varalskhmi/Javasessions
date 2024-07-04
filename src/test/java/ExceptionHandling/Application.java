package ExceptionHandling;

public class Application {

	//Amazon login
	public void m1()
	{
		System.out.println("m1 methd");
		m2();
	}
	//Amazon cart
	public void m2()
	{
		System.out.println("m2 methd");
		try {
		m3();
		}
		catch(ArithmeticException e)
		{
			System.out.println("AE is comming");
			//report--pass/fail
			//screenshot
			//logs
		}
	}
	//Payment---ICIC bank
	public void m3()
	{
		System.out.println("m3 methd");
	}
	
	//Caller/user method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application obj=new Application();
		obj.m1();
		System.out.println("Bye");
		}

}
