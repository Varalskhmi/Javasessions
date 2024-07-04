package HashMapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		HashMap<String,String> stumap=new HashMap<String,String>();
		stumap.put("Tom", "A");
		stumap.put("peatrer", "B");
		stumap.put("vara", null);
		stumap.put("kou", null);
		stumap.put("vaishu", null);
		stumap.put(null, "Z+");
		stumap.put(null, "P++");
		
		System.out.println(stumap);
		System.out.println(stumap.get("Tom"));
		System.out.println(stumap.get(null));
		
	}

}
