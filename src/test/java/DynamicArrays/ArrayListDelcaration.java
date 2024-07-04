package DynamicArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDelcaration {

	public static void main(String[] args) {
		
		//Top casting: List is Interface,ArrayList is child class
		List<Integer>  a=new ArrayList<Integer>();
		
		List<Integer> numberlist=Arrays.asList(1,2,3,4,5);
		System.out.println(numberlist);
		
		
		List<String> browserlist=Arrays.asList("cheome","firefox","safari","mousilla");
		System.out.println(browserlist);
		
		
//		browserlist.add("ie");//UnsupportedOperationException
//		System.out.println(browserlist.size());
		
		ArrayList<String> emplist =new ArrayList<String>(Arrays.asList("chrome","ie","firefox","edge"));
		System.out.println(emplist.size());
		
		emplist.add("micro");
		System.out.println(emplist.size());
		
		
		
		
		
		
		
		
		
	}

}
