package pack2;

import pack1.Circle;


public class Main3 {

	public static void main(String[] args) {
		
		
		Circle c1 = new Circle(10);

		Circle c2 = new Circle(20);

		System.out.println(c1);
		System.out.println(c2);

		Circle c3 = c1.enLarge(100);
		System.out.println(c3);
		
		Circle c4 = c2.enLarge(100);
		System.out.println(c4);


	}

}
