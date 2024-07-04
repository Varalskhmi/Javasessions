package SuperKeyword;

public class Page {
	String name;
	String title;

	public Page() {
		this("loginpage");//1st statement
		System.out.println("defult construtor");
	}
	public Page(String name) {
		this("HomePage","Amazon");
		System.out.println("1 parameter  construtor");
		System.out.println(name);
		
	}
	public Page(String name, String title) {
		System.out.println("2 parameter  construtor");
	//	this.name = name;
		//this.title = title;
		System.out.println(name);
		System.out.println(title);
	}
}
