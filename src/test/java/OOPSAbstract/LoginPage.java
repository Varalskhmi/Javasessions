package OOPSAbstract;

public class LoginPage extends Page {

	public LoginPage()
	{
		System.out.println("Loginpage ---default constructor...");
	}
	public LoginPage(int a)
	{
		System.out.println("Loginpage ---one parameter constructor..."+a);
	}
	public LoginPage(int a,int b)
	{
		System.out.println("Loginpage ---two parameter constructor..."+a+b);
	}
	
	
	@Override
	public void title() {
		// TODO Auto-generated method stub
		System.out.println("title");
	}

	@Override
	public void url() {
		System.out.println("url");
	}
	public void doLogin(String un, String pass)
	{
		System.out.println("user is logged with:"+un+pass);
	}

}
