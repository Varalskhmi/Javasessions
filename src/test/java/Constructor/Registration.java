package Constructor;

public class Registration {

	String name;
	String emailId;
	String phone;
	int age;
	String city;
	String dob;
	public Registration(String name, String emailId) {
		super();
		this.name = name;
		this.emailId = emailId;
	
	}
	public Registration(String name, String emailId, String phone, int age, String city) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.age = age;
		this.city = city;
	
	}
	public Registration(String name, String emailId, String phone, int age, String city, String dob) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.age = age;
		this.city = city;
		this.dob = dob;
	}

	public static void main(String[] args) {
		Registration r1=new Registration("vara","vara@gmail.com");
		System.out.println(r1.name+" "+r1.age+"  "+r1.emailId+" "+r1.city+ " "+r1.dob);

	}

}
