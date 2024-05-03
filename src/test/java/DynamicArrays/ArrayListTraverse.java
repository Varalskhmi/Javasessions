package DynamicArrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTraverse {

	public static void main(String[] args) {
		ArrayList<Integer> marklist=new ArrayList<Integer>();
		marklist.add(1200);
		marklist.add(1800);
		marklist.add(400);
		marklist.add(500);
		marklist.add(100);
		
		System.out.println(marklist);
		for(int i=0;i<marklist.size();i++)
		{
			System.out.println(marklist.get(i));
		}
		for(int e:marklist)
		{
			System.out.println(e);
		}
		System.out.println("----------------------");
		
		Collections.sort(marklist);
		System.out.println(marklist);
		Collections.sort(marklist,Collections.reverseOrder());
		System.out.println(marklist);
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("vara");
		names.add("mona");
		names.add("pothana");
		names.add("kous");
		names.add("Amma");
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
		
		Collections.swap(names,0,1);
		System.out.println(names);
		
	}

}
