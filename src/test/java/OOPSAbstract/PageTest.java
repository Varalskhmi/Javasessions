package OOPSAbstract;

public class PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp=new LoginPage();
		lp.title();
		lp.url();
		Page.displayLogo();
		lp.doLogin("vara", "admin");
		
		//Top casting
		//child class object can be referred by parent abstract class reference variable
		
		Page p=new LoginPage();
		p.title();
		p.url();
		p.getPageInfo();
	}

}
