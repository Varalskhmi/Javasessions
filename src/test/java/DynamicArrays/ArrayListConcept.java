package DynamicArrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();//vc=10,pc=0;
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		System.out.println(ar.size());//4
		
		ar.add(500);//4
		ar.add(600);//5
		
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		
		
		
		
		
	}

}
