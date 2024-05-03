package Builderpath;

public class Ecommerce {
	public Ecommerce login()
	{
		System.out.println("user is logged in..");
		//here every method should written something
		//every method will return its current class object
		return this;
	}
	public Ecommerce login(String userName,String password)
	{
		System.out.println("user is logged in. with:"+userName+" "+password);
		return this;
	}
	
	public Ecommerce search()
	{
		System.out.println("search with different products");
		return this;
	}
	public Ecommerce search(String productName)
	{
		System.out.println("search with  product"+productName);
		return this;
	}
	public Ecommerce search(String productName,int price)
	{
		System.out.println("search with  product"+productName+" "+price);
		return this;
	}
	public Ecommerce addToCart(String productName)
	{
		System.out.println("add to cart:"+productName);
		return this;
	}
	public Ecommerce payment(String upi)
		{
		System.out.println("make payment"+upi);
		return this;
	}
	public Ecommerce payment(String cc,int cvv) 
	{
		System.out.println("make payment via CC:"+cc+" "+cvv);
		return this;
	}
	public Ecommerce generateOrder()
	{
		System.out.println("your order id is :"+12345);
		return this;
	}
	public Ecommerce logout()
	{
		System.out.println("logout");
		return this;
	}
}
