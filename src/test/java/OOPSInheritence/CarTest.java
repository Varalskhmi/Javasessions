package OOPSInheritence;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW obj=new BMW();
		obj.start();//Overridden
		obj.stop();//inherited
		obj.refuel();//inherited
		obj.autoParking();//Individual
		obj.engine();//Overidden
		BMW.billing(); // child class name can access parent class static method
		System.out.println(obj.minSpeed);
		obj.BMWService();
	System.out.println("-------");
	
	Car c=new Car();
	c.start();
	c.stop();
	c.refuel();
	c.engine();
	Car.billing();
			
	System.out.println("_________");
	
	//child class object can be referred by parent class reference variable--Top Casting
	Car c1=new BMW();
	c1.start();
	c1.stop();
	c1.refuel();
	c1.engine();
	
	//Top casting with grand parent
	Vechile v1=new BMW();
	v1.driver();
	//Down Casting
	//Parent class object can be referred by child class reference variable 
	BMW b1=(BMW)new Car();//not possible we don't use in practical 
	BMW b2=(BMW)new Vechile();//down casting//classcostException
	Car c2=(Car) new Vechile();//down casthing/classcostException
	
	}

}
