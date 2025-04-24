package pack1;

public class Main7 {
	
	public static void main(String[] args) {
		
		Integer obj1=Integer.valueOf(200);//boxing
		
		int x=500;
		Integer obj2=x;//Auto boxing
		
		int y=obj2.intValue();//unboxing
		
		int z=obj2;//auto unboxing
		
		System.out.println(obj2);
		obj2++;//obj2.intValue(),increment the extracted value,new object...Integer.valueOf()
		System.out.println(obj2);
		
		
	}

}
