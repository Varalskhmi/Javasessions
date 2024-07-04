package AccessModifiers;

public class Car {
	public String name;
	private int price;
	protected double milage;
	String color;
	
	 void test()
	{
		System.out.println("Car---test");
	}
	public static void main(String arg[])
	{
		Car c=new Car();
		
	}
}
