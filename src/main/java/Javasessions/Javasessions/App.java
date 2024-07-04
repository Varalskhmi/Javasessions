package Javasessions.Javasessions;

public class App {
  public static void main(String[] args) {
   int test[]= {1,22,3,43,5,61};
   
   int count= test.length-1;
   for(int e:test)
   {
	   e=count;
	   System.out.println(test[e]);
	   count--;
   }
   
   }
}
