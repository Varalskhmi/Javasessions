package DynamicArrays;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> marklist=new ArrayList<Integer>();
		marklist.add(1200);
		marklist.add(1800);
		marklist.add(400);
		marklist.add(500);
		marklist.add(100);
		
		System.out.println(marklist);
		
		marklist.remove(2);
		System.out.println(marklist.get(2));
		
		marklist.remove(0);
		System.out.println(marklist);
		
		marklist.add(1,25);
		System.out.println(marklist);
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("vara");
		names.add("mona");
		names.add("pothana");
		names.add("kous");
		names.add("Amma");
		System.out.println(names);
		names.add("Koushik");
		System.out.println(names);
		names.add(0,"Abcd");
		System.out.println(names);
		
		names.add(names.size(),"google");
		System.out.println(names);
	}

}
