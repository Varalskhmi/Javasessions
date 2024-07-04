package StaticMethods;

public class Rest {
	public void m1()
	{
		System.out.println("m1 method");
	}
	public void m2()
	{
		System.out.println("m2 method");
	}
	public void m3()
	{
		System.out.println("m3 method");
	}
	
	public static void t1()
	{
		System.out.println("t1 method");
	}
	public static void t2()
	{
		System.out.println("t2 method");
	}
	public static void t3()
	{
		System.out.println("t3 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Rest obj=new Rest();
		//obj.m1();
		Rest.t1();
		
	}

}
