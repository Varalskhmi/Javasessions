package DataConversion;

public class DataCovert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="100";
		System.out.println(x+200);
		
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
//		String A="200A";
//		int j=Integer.parseInt(A);
//		System.out.println(j+20);
		
		String y="12.33";
		System.out.println(y+20);
		
		double d=Double.parseDouble(y);//12.33
		System.out.println(d);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		//string to boolean
		String execute="true";
		boolean flag=Boolean.parseBoolean(execute);
		if(flag)
		{
			System.out.println("Run my testcase");
		}
		else
		{
			System.out.println("exit");
		}
		
		//convert integer to string
	int a=200;
	System.out.println(a+20);
	
	String s=String.valueOf(a);
	System.out.println(s+200);
	//boolean to string
	boolean flage= true;
	String f=String.valueOf(flage);
	System.out.println(f.length());
	
	
	String tr=""; //blank and empty
	System.out.println(tr.isEmpty());//true
	System.out.println(tr.isBlank());//true
	
	String tr1=" "; //blank
	System.out.println(tr1.isEmpty());//false
	System.out.println(tr1.isBlank());//true
	
	
	String tr2="   ";//blank
	System.out.println(tr2.isEmpty());//false
	System.out.println(tr2.isBlank());//true
	
	String tr3="  v  ";//blank
	System.out.println(tr3.isEmpty());//false
	System.out.println(tr3.isBlank());//false
	
	}

}
