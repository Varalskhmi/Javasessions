package OOPSAbstract;

public abstract class Page {
	
	static final int Time_out=10;
	//can not create the object of Abstract
	//can have abstract + non-abstract methods
	//Only abstract method: 100% abstraction
	//Only non abstract methods: 0% abstraction
	//abstract + non-abstract  methods: partial abstraction[0-100%]
	public abstract void title();
	public abstract void url();
	
	public static final   void displayLogo()
	{
		System.out.println("Page ---display logo");
	}
	public void getPageInfo()
	{
		System.out.println("Page ---getPageinfo");
	}
	private void billing()
	{
		System.out.println("page billing");
	}
	public void getBillInfo()
	{
		billing();
	}
}
