
public class CircleClient {

	public static void main(String[] args) {

		Circle c1;
		c1 = new Circle();
		System.out.println(c1.radius);
		c1.radius = 5;
		System.out.println(c1.computeArea());
		c1 = null;
		
		Circle c2=new Circle();
		c2.radius=10;
		System.out.println(c2.computeArea());
		c2=null;
		
		Circle c3=new Circle();
		c3.radius=50;
		System.out.println(c3.computeArea());
		c3=null;
		
		Circle c4=new Circle();
		c4.radius=80;
		System.out.println(c4.computeArea());
		c4=null;
		
		
		

	}

}
