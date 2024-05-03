package SetConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetConcept {

	public static void main(String[] args) {
		Set<String> browserSet=new LinkedHashSet<String>();//vc=16
		browserSet.add("chrome");
		browserSet.add("firefox");
		browserSet.add("opera");
		browserSet.add("ie");
		browserSet.add(null);
		
		System.out.println(browserSet);
		//traverse
		for(String e:browserSet)
		{
			System.out.println(e);
		}
		
		//set to list
		List<String> browserList=new ArrayList<String>(browserSet);
		System.out.println(browserList.get(0));

		
		
		
		
	}

}
