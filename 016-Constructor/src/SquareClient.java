
public class SquareClient {
	public static void main(String[] args) {
		Square s1 = new Square();
		s1.setSize(10);
		System.out.println(s1.getSize());

		Square s2 = new Square(20);
		System.out.println(s2.getSize());
	

	}

}
