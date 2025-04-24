package pack1;

public class Main8 {

	public static void main(String[] args) {
		
		Double obj=Double.valueOf(200.00);//boxing
		
		double x=500.00;
		Double obj1=x;//autoboxing
		
		System.out.println(obj1);
		
		
		double y=obj1.doubleValue();//unboxing
		
		double z=obj1;//auto unboxing
		
		System.out.println(z);
		obj1++;
		System.out.println(obj1);

	}

}
