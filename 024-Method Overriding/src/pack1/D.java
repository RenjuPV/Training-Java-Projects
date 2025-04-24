package pack1;

public class D extends C{
	
	/*
	@Override
	public C(int a) { //constructor can not be override
		this.a = a;

	} */
	
	
	/* @Override
	private void display() { //private method can not be override
		System.out.println("Inside C :" + this.a);

	} */
	
	private void display() { //private method can  be redefined
		System.out.println("Inside C :" + this.a);

	}
	
	/*
	@Override
	public static void show() { //static method can not be override
		System.out.println("Inside C :");

	} */
	
	/*
	
	public static void show(int a) { //static method can  be redefined
		System.out.println("Inside static show C :"+a);//static method can be overloaded

	}*/
	
	
	@Override
	public void test(int a) { // method overloading with same return type
		System.out.println("Inside C :" + a);

	}
	
	@Override
	public int test(int a,int b) { // method overloading with different return type
		System.out.println("Inside C :" + a);
		return a;

	}
	
	/*
	
	public  void show(int a) { //static method can not be redefined as instance method
		System.out.println("Inside static show C :"+a);//static method can be overloaded

	}  */
	
	/*
	
	@Override
	public static void test() { // instance method can not be redefined as static
		System.out.println("Inside C :" );

	} */
	
	/*
	
	@Override
	protected void display(float a) { //access level can not be reduced
		System.out.println("Inside C :" + this.a);

	} */
	
	public void display(float a,float b) { //method overloading in subclass
		System.out.println("Inside C :" + this.a);

	}
	
	/*
	@Override
	public final void check(double a,int b) { //final method cannot be override
		System.out.println("Inside  final show C :"+a+","+b);

	}*/
	
	
	
	
	
	
	

}
