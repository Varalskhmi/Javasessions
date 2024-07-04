package SuperKeyword;

public class BMW extends Car {
	int speed = 200;

	public BMW()
	{
		//super("MG");//not able to access grand parent constructor
		super(20);
		System.out.println("BMW---default constructor.....");
	}
	
	public BMW(int a)
	{
		System.out.println("BMW---one parameter constructor.....:"+a);
	}
	@Override
	public void loading()
	{
		System.out.println("BMW loading");
	}
	@Override
	public void display() {
		super.display();
		System.out.println(speed);// 200 from BMW
		int carSpeed = super.speed;
		System.out.println(carSpeed);
		System.out.println("BMW ---displa");
		System.out.println(super.price);
		loading();
		super.loading();
	}
	
	public void driver()
	{
		System.out.println(speed);//200
		System.out.println(this.speed);//200 current class speed
		super.display();
		System.out.println(super.speed);//100
	}
}
