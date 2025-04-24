
public class BClient {

	public static void main(String[] args) {

		B obj = new B();
		obj.display();
		System.out.println(obj.display(10));
		obj.display(10, 20);
		obj.display(2, 2.0f);
		obj.display(5, 05.0f, false);

		B.display(10, 5.0f, 20.0d);
	}

}
