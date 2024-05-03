package OOPSInheritence;

public class BMW extends Car {
	//method overriding
	//when we have a method in parent class and he same method in the child class with:
	//1.with the same name
	//2.with the same no of parameters with the same sequence
	//3.with the same return type
	int minSpeed=200;
	
	@Override
	public void start()
	{
		System.out.println("BMS-start");
	}
	public void autoParking()
	{
		System.out.println("BMW --Auto parking");
	}
	public void engine()
	{
		System.out.println("BMW  vechile---- engine");
	}
	
	//Method hiding -->Static method  in parent class and the same static method in child class
	public static void billing()
	{
	System.out.println("Car---billing");
	}
	//Not overriden
	private void BMWervice()
	{
		System.out.println("BMW Service");
	}
	public void BMWService()
	{
		BMWervice();
	}
}
