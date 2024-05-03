package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// Throw
		String data=null;
		if(data==null)
		{
			//wan to throw my own exception
			throw new RuntimeException("DATA NOT FOUND EXCEPTION");
			
		}
		System.out.println("fill the form");
	}

}
