package StringManipulation;

public class StringReverseWord {

	public static void main(String[] args) {
//		String s="this is java code in selenium";
//		String rev="";
//		String[] words=s.split(" ");
//		for(String ele:words)
//		{
//			rev=rev+StringReverseTest.reverseString(ele)+" ";
//		}
//		System.out.println(rev.trim());

		//2nd method
		String s="this is java code in selenium";
		String[] words=s.split(" ");
		String rev="";
		
		for(String ele:words)
		{
			String revwords="";
			for(int i=ele.length()-1;i>=0;i--)
			{
				revwords=revwords+ele.charAt(i);
			}
			rev=rev+revwords+" ";
					}
		System.out.println(rev.trim());
		
		int i=10;
		i=i+20;
		System.out.println(i);
	}

}
