package SuperKeyword;

public class Car extends Vechile{
	int speed = 100;
	int price=300;

public Car()
{
	super("MG");
	System.out.println("Car---default constructor.....");
}

public Car(int a)
{
	System.out.println("Car---one parameter  constructor.....:"+a);
}

	public void display() {
		System.out.println("car ---displa");
	}
	public void loading() {
		System.out.println("car loading");
		super.loading();
	}
}
