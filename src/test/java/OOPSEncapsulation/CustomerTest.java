package OOPSEncapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Post/Create
		Customer c=new Customer("vara", 32,8.25, true);
		
		//Get/Retrive
		System.out.println(c.getName()+" "+c.getAge()+" "+c.getSalary()+" "+c.isActive());
		
		//put/Patch/update
		c.setSalary(95.5);
		c.setAge(33);
		
		//Get
		System.out.println(c.getName()+" "+c.getAge()+" "+c.getSalary()+" "+c.isActive());
		
		//2nd
		Customer c1=new Customer();//create customer without  any value
		System.out.println(c1.getName()+" "+c1.getAge()+" "+c1.getSalary()+" "+c1.isActive());
		
		//put
		c1.setName("koushik");
		c1.setAge(34);
		c1.setSalary(34.3);
		c1.setActive(true);
		
		//Get
		System.out.println(c1.getName()+" "+c1.getAge()+" "+c1.getSalary()+" "+c1.isActive());
		
	
		
		
	}

}
