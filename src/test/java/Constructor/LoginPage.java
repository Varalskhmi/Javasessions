package Constructor;

public class LoginPage {
	String userName;
	String password;
	
	public LoginPage(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public void login()
	{
		System.out.println("enter username:"+userName);
		System.out.println("enter password:"+password);
		System.out.println("Click on login button");
		System.out.println("login id dine");
	}
	public static void main(String[] args) {
		LoginPage lp=new LoginPage("vara","vara@123");
		lp.login();
	}
}
