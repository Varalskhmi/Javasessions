package Constructor;

public class Employee {

	String name;
	int age;
	double salary;
	String devices[];
	
	// Constructor :
	// name will be same as the class name
	// it looks like a function but its not a function
	// const... can not return anything, no void, no return type
	// const.. can be overloaded
	// const.. will be called when you create the object
	// const will help to intialize the instance variables
	// const will help to restrict the object creation
	
	//const vs function:
	//const  name should be same name as class name but function can have any name
	//const.. can not return anything...but function may or may not return
	//const.. and method can be overloaded
	//const will be called when you create the object of the class but method has to be called using obj ref name
	//const.. should be created for restrciting the objects creation
	//func.. should be created for the functionality, buss logic
	//const.. is used to initlialize the instance vars using this keyword: this.G = L
	//static vars should not be created inside the const... but in function it can be used
	//const.. will not be created in heap, stack
	public Employee()
	{
		System.out.println("default constructor");
	}
	public Employee(int a)
	{
		System.out.println("1 parameter:"+a);
	}
	public Employee(String name)
	{
		this.name=name;
	}
	public Employee(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}

	public Employee(String name, String[] devices) {
		
		this.name = name;
		this.devices = devices;
	}
	public Employee(String name, int age, double salary) {
		//super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		//this.devices = devices;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("Vara");
		System.out.println(e1.name);
		
		Employee e2=new Employee("Vara",31);
		System.out.println(e2.name);
		System.out.println(e2.age);
		
		Employee e3=new Employee("Vara",31, 23.34);
		
		String dev[]= {"laptop","phone"};
		Employee e4=new Employee("pothana",dev);
		
		
	}

	
}
