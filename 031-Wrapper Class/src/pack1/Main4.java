package pack1;

public class Main4 {
	
public static void main(String[] args) {
		
		long l=100;
		Long obj1=Long.valueOf(l);//boxing
		
		byte v1=obj1.byteValue();
		System.out.println(v1);
		
		short v2=obj1.shortValue();
		System.out.println(v2);
		
		int v3=obj1.intValue();
		System.out.println(v3);
		
		long v4=obj1.longValue();//unboxing
		System.out.println(v4);
		
		float v5=obj1.floatValue();
		System.out.println(v5);
		
		double v6=obj1.doubleValue();
		System.out.println(v6);
		
		String str="98";
		long x=Long.parseLong(str);
		System.out.println(++x);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
		
	}

}
