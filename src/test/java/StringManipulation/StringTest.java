package StringManipulation;

public class StringTest {

	public static void main(String[] args) {
		//String literal
		//Using new keyword
		String s1="Hello";//store in String constant pool
		String s2=new String ("Hello");//store in heap
		
		
		String s3=new String("Naveen");//will store heap and string constant
		String s4="Naveen";;//not store //0
		String s5=new String("Naveen");
		String s7="naveen";
		String t1="Hello";
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s1==t1);//true
		System.out.println(s1.equals(t1));//true
		
		String r1=new String("Selenium");
		r1=r1.intern();
		
	}

}
