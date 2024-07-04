package SetConcept;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
		Set<String> browserSet=new TreeSet<String>();//vc=16
		browserSet.add("chrome");
		browserSet.add("firefox");
		browserSet.add("opera");
		browserSet.add("ie");
		browserSet.add("123");
		browserSet.add("Apple");
		browserSet.add(null);
		//browserSet.add(null);
		
		System.out.println(browserSet);
	}

}
