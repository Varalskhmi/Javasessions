package DynamicArrays;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(12.33);
		ar.add("testing");
		ar.add('g');
		ar.add(true);
		
		//Integertype of arraylist
		
		ArrayList<Integer> marklist=new ArrayList<Integer>();
		marklist.add(8);
		marklist.add(7);
		ArrayList<Double> marklist1=new ArrayList<Double>();
		marklist1.add(8.33);
		marklist1.add(7.44);
		ArrayList<String> marklist2=new ArrayList<String>();
		marklist2.add("Hello");
		marklist2.add("Amma");
		
		ArrayList<Object> empdata=new ArrayList<Object>();
		empdata.add("tom");
		empdata.add(30);
		empdata.add('m');
		empdata.add(33.22);
		empdata.add(true);
		
		System.out.println(empdata.size());
				
	}

}
