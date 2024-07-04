package AccessModifiers;

public class BMW extends Car{

	@Override
	protected void test()
	{
		System.out.println("BMW---test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b=new BMW();
	}

}
