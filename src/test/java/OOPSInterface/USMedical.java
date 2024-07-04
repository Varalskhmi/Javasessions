package OOPSInterface;

public interface USMedical extends WHO {
	
	//Interface methods can not have method body
	//Abstract method  : no method body
	
	int MIN_FEE=10;
	//Interfce varialbles are tatic and final by default
	//can not create the object of interface
	//consructor is not allowed
	
	public void physioServices();
	public void physioServices(int a);
	public void oncologyServices();
	public void detalServices();
	public void emergencyServices();
	
	//after JDK  1.8
	//1.Can have a static method  with method body
	
	public static void billing()
	{
		System.out.println("US--billing");
	}
	//2.can have default method with method body: non static
	//It can be overridden
	default void helpDesk()
	{
		System.out.println("US--helpdesk");
	}
	
}
