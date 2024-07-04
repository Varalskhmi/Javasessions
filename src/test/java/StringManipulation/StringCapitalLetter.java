package StringManipulation;

public class StringCapitalLetter {

	public static void main(String[] args) {
		String s="this is java code in selenium";
		String ss[]=s.split(" ");
		String newstr="";
		for(String e:ss)
		{
			newstr=newstr+e.replace(String.valueOf(e.charAt(0)),String.valueOf(e.charAt(0)).toUpperCase())+" ";
		}
		System.out.println(newstr.trim());
		String revw="";
		for(int i=newstr.length()-1;i>=0;i--)
		{
			revw=revw+newstr.charAt(i);
			
		}
		//newstr=newstr+revw+" ";
		System.out.println(revw.trim());
	}

}
