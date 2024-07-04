package Constructor;

import java.util.Arrays;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d[]= {"keboard","mouse","Monitor","remote"};
		Customer obj=new Customer("vara", 32, d);
		
		String rahulDev[]=obj.getDevicesInfo();
		System.out.println(Arrays.toString(rahulDev));
		
		int count=obj.getDevicesCount();
		System.out.println(count);
		
		Browser.get();
		Browser.close();
		
	}

}
