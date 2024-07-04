package Constructor;

public class Car {
	String name;
	int price;
	String coolor;
	String licence;
	String brand;
	public Car(String name, int price, String brand) {
		//super();
		this.name = name;
		this.price = price;
	
		this.brand = brand;
	}
	public Car(String name, String brand) {
		//super();
		this.name = name;
		this.brand = brand;
	}
	
	public Car(String name, int price, String licence, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.licence = licence;
		this.brand = brand;
	}
	public Car(String name, int price, String coolor, String licence, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.coolor = coolor;
		this.licence = licence;
		this.brand = brand;
	}
	
}
