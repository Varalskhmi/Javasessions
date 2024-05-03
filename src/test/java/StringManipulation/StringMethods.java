package StringManipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String str="this is my java code and I am so happy";
		System.out.println(str.length());
		System.out.println("Least index="+0);
		System.out.println("hiegth index="+(str.length()-1));
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(7));//space
		
		//System.out.println(str.charAt(-1));//StringIndexOutoutBoundException
		
		System.out.println(str.indexOf('t'));
		
		System.out.println(str.indexOf('i'));//1st occurence of i
		System.out.println(str.indexOf('i',str.indexOf('i')+1));
		//System.out.println(str.indexOf('i',str.indexOf('i')+1));
		
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("naveen"));
//		String msg="Welcome admin";
//		if(msg.indexOf("admin==8"))
//		{
//			System.out.println("user name is present");
//		}
//		else {
//			System.out.println("user name is not fount");
//		}
		
		//lower case and upper case
		String test="Selenium automation";
		String pop="SELENIUM TESTING";
		System.out.println(test.toUpperCase());
		System.out.println(pop.toLowerCase());
		
		//trim
		String username=" test automation  ";
		System.out.println(username.trim());
		
		//replace
		String dob="26-06-1992";
		System.out.println(dob.replace("-","/"));
		
		String loop="I love  testing";
		System.out.println(loop.replaceAll("love", "enjoy"));
		
		System.out.println("automation".replace("a","P"));
		
		//contains
		String msg="Welcome admin";
		System.out.println(msg.contains("admin"));
		
		//equals
		String t1="hello selenium";
		String t2="hello Selenium ";
		System.out.println(t1.equals(t2));//false
		System.out.println(t1.equalsIgnoreCase(t2));//true but when provide space will get false
		
		//split
		String lang="jAVA_PYTHON_JAVASCRIPT_RUBY";
		String lg[]=lang.split("_");
		System.out.println(lg[0]);
		System.out.println(Arrays.toString(lg));
		
		String data="xXTestingXxXSeleniumXXxXAutomationxXxJavaX";
		String d[]=data.split("xX");
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);
		
		String  rest="testing | automation | cypress | selenium";
		String r[]=rest.split("\\|");
		System.out.println(r[0]);
		System.out.println(r[1]);
		
		String pest="testing.automation.cypress.selenium";
		String p[]=pest.split("\\.");
		System.out.println(p[0]);
		
		String empData="Tom;peter;30;IBM;Bangaklore";
		String emp[]=empData.split(";");
		System.out.println(emp[0]);
		
		String word="I love \"Java\" coding";//I love "Java" coding
		System.out.println(word);
		
		String w="I love  'java' coding";
		System.out.println(w);
		
		String xpath="//input[@id=\"firstnam\"]";
		System.out.println(xpath);
		
		
				
		
		
		
		
	}

}
