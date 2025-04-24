
public class CircleClient {

	public static void main(String[] args) {
		
		Circle c1=new Circle();
		c1.radius=5;
		//c1.PI=4.50;
		Circle.PI=4.50;
		System.out.println(c1.radius);
		//System.out.println(c1.PI);
		System.out.println(Circle.PI);

		Circle c2=new Circle();
		c2.radius=10;
		System.out.println(c2.radius);
		//System.out.println(c2.PI);
		System.out.println(Circle.PI);

		
		Circle c3=new Circle();
		c3.radius=15;
		System.out.println(c3.radius);
		//System.out.println(c3.PI);
		System.out.println(Circle.PI);

	}

}
