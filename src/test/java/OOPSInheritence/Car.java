package OOPSInheritence;

//final class can not  be a parent class-->preventing Inheritence
public class Car  extends Vechile{
	
	
	int minSpeed=100;
	//final method can not be overriden-->preventing method overriding
	public static final void testDrive()
	{
		System.out.println("Car---  test drive");
	}
	public void start()
	{
		System.out.println("Car---  start");
	}
	public void stop()
	{
		System.out.println("car--stop");
	}
	public void refuel()
	{
		System.out.println("car--refuel");
	}
	
	@Override
	public void engine()
	{
		System.out.println("car----engine");
	}

	public static void billing()
	{
		System.out.println("Car---billing");
	}
	//private method can not be overriden
	private void service()
	{
		System.out.println("Car=== service");
	}
}
