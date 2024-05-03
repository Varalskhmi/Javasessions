package Functions;

public class FunctionInJava {

	//function: data member of the class
	
		//can not create a function inside a func
		//func are always parallel to each other/independent
		//but call a func from another function
		
		//------1. with no input and no return:--------
		//void -> can not return anything
	
	public void test()
	{
		System.out.println("test mehod");
		}
	public void getInfo()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		}
// 	2. with no input but some return:--------
	public int getBillAmount() {
		System.out.println("getBillAmount");
		int foodBill=100;
		int tax=20;
		int finalAmount=foodBill+tax;
		return finalAmount;
		}
	public String getTrainerName() {
		System.out.println("get Trainer Name");
		String name="vara";
		return name;
	}
	// 3. Some input and some return
	
	public int add(int a,int b)
	{
		System.out.println("adding two numbers");
		int sum=a+b;
		return sum;
	}
	public double getTotalMarks(int firstSubject, int secondSubject, double negativeMarking) {
		System.out.println("getting total marks");
		double finalMarks = firstSubject + secondSubject - negativeMarking;
		return finalMarks;
	}
	
	public static void main(String[] args) {
		FunctionInJava f=new FunctionInJava();
		f.test();
		f.getInfo();
		int m=f.getBillAmount();
		System.out.println(m-10+5);
		String T=f.getTrainerName();
		System.out.println(T);
		int s=f.add(10, 20);
		System.out.println(s);
		double d=f.getTotalMarks(100, 50, 200);
		System.out.println(d);
	}

}
