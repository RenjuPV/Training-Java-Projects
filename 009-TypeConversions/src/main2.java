
public class main2 {

	public static void main(String[] args) {
		
		int v1=100;
		
		//short v2=v1;//narrowing conversion,not allowed
		
		short v3=(short)v1;//explicit,narrow conversion
		byte v4=(byte)v3;
		
		double v5=90.0;
		
		byte v6=(byte)v5;//explicit,narrow conversion
		System.out.println(v6);
		
		short v7=(short)v5;//explicit,narrow conversion
		System.out.println(v7);
		
		int v8=(int)v5;//explicit,narrow conversion
		System.out.println(v8);
		
		long v9=(long)v5;//explicit,narrow conversion
		System.out.println(v9);
		
		float v10=(float)v5;//explicit,narrow conversion
		System.out.println(v10);
		
		char v11=(char)v5;//explicit,narrow conversion
		System.out.println(v11);
		
		//boolean v12=(boolean)v5;//can't convert boolean
		

	}

}
