
public class AClient {
	public static void main(String[] args) {
		A aObj = new A();
		aObj.display1();
		// aObj.welcome();
		A.welcome();// static method is calling using class name
	}

}
