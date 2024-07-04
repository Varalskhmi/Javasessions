package HashMapConcept;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		//Map<String,String> empM=new HashMap<String ,String>();//vc=16,pc=0;
		Map<String,String> empM=new LinkedHashMap<String ,String>();//vc=16,pc=0;
		
		//Map<String,String> empM=new TreeMap<String ,String>();
		System.out.println(empM.size());//0
		
		empM.put("petter", "QA");
		empM.put("Lisa", "SSDE");
		empM.put("EKTA", "Dev");
		empM.put("Ravi", "Manager");
		empM.put("Arti", "Fresher");
		empM.put("Akash", "Fresher");
		empM.put("1test", "Fresher");
		
		for(Map.Entry<String , String> entry :empM.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("-------------------");
		
		//foreach method using Lamda
		empM.forEach((k,v) ->System.out.println(k+":"+v));
		
		
		
		System.out.println(empM.get("Lisa"));
		System.out.println(empM.get("Selenium"));
		
		System.out.println(empM);
		
		
		//use cases for HashMap:
		//1. RBAC (user roles): seller, partner, distributor, vendor, user, admin
		//2. <String, Integer>: Product Price Data
		//3. Product Meta Data
		//4. Excel Data
		//5. API Testing: Headers in HashMap
		
		//Properties : K,V
	}

}
