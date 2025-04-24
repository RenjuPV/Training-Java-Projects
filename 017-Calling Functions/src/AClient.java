
public class AClient {

	public static void main(String[] args) {
		System.out.println(A.y);
		A.printY();
		A.printGoodBye();
		
		A obj1=new A();
		A obj2=new A(10);
		
		System.out.println(obj2.x);
		obj2.printX();
		obj2.printWelcome();
		
		obj1.printX();
		obj1.printWelcome();
		
		

	}

}
