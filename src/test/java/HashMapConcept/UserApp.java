package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class UserApp {
	
	public static String getUserCreds(String role) {
	Map<String , String> userRole = new HashMap<String,String>();
	userRole.put("admin", "admin;admin");
	userRole.put("seller", "seller@gmail.com;seller@123");
	userRole.put("vendor", "vendor@gmail.com;vendor@123");
	userRole.put("customer", "ekta@gmail.com;ekta@123");
	userRole.put("catmanager", "cat@gmail.com;cat@123");
	
	return userRole.get(role);
	}
	
	public static void doLogin(String username, String password)
	{
		System.out.println("Login with:"+username+" "+password);
	}
	public static void main(String[] args) {
		String creds=getUserCreds("admin");
		System.out.println(creds);
		String cred[]=creds.split(";");
		String username=cred[0];
		String password=cred[1];
		
		doLogin(username,password);
		
	}

}
