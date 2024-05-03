package Builderpath;

public class EcommTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecommerce obj=new Ecommerce();
		obj.login("vara","vara123")
	            .search("Apple mackbook pro")
					.addToCart("Apple mackbook pro")
						.payment("1234 1234 1234 1234",123)
							.generateOrder()
							.logout();
	            System.out.println("---------------");
		
	}

}
