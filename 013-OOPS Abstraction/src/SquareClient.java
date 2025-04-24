
public class SquareClient {

	public static void main(String[] args) {
		
		Square s1=new Square();
		s1.size=10;
		System.out.println("Area of the square with size "+s1.size+" : "+ s1.getArea());
		s1=null;
		
		Square s2=new Square();
		s2.size=20;
		System.out.println("Area of the square with size "+s2.size+" : "+s2.getArea());
		s2=null;
		
		
		Square s3=new Square();
		s3.size=25;
		System.out.println("Area of the square with size "+s3.size+" : "+s3.getArea());
		s3=null;
		

	}

}
