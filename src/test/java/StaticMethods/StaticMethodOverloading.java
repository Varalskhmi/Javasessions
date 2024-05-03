package StaticMethods;

public class StaticMethodOverloading {
	public static void sendmail() {
		System.out.println("Send mail");
	}

	public static void sendMail(int a) {
		System.out.println("send mail:" + a);
	}

	public static void sendMail(int a, int b) {
		System.out.println("Send mail:" + (a + b));
	}

	public static void sendMail(String a, int b) {
		System.out.println("send mail:" + a + b);
	}

	public static void main(String[] args) {
		
		StaticMethodOverloading.sendmail();
		StaticMethodOverloading.sendMail(10);
		StaticMethodOverloading.sendMail(10,20);
		StaticMethodOverloading.sendMail("vara", 8);
	}

}
