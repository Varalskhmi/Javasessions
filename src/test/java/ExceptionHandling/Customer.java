package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Customer {
	String name;
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		Customer c=new Customer();
		c=null;
		try {
			
		int i=9/0;//AE
		c.name="vara";//NPE
		System.out.println("Hello");
		}
		catch(ArithmeticException e)
		{
			System.out.println("AE is comming");
		}
		catch(NullPointerException  e)
		{
			System.out.println("NPE Exception  is comming");
		}
		catch(Exception  e)
		{
			System.out.println("Some  Exception  is comming");
			e.printStackTrace();
		}
		System.out.println("Bye");
		
		//checked Exception/compile time exceptions		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Checked exception
		try {
			FileInputStream f=new FileInputStream("c:\\test.pdf");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
