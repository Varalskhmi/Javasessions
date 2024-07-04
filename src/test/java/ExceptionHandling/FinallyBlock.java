package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("A");
		try {
			int i=9/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("Bye");
		//connection with DB
	}

}
