package pack1;

public class C {

	int a;

	public C() {

	}

	public C(int a) {
		this.a = a;

	}

	private void display() { //private method overloading
		System.out.println("Inside C :" + this.a);

	}
	
	
	
	public void display(float a) { //private method overloading,access level can change
		System.out.println("Inside C :" + this.a);

	}
	
	private void display(int a) { //private method overloading
		System.out.println("Inside C :" + a);

	}
	
	public static void show() { //static method can be overloaded
		System.out.println("Inside C :");

	}
	public static void show(int a) { 
		System.out.println("Inside static show C :"+a);//static method can be overloaded

	}
	
	public void test() { // method overloading
		System.out.println("Inside C :" + a);

	}
	
	public void test(int a) { // method overloading with same return type
		System.out.println("Inside C :" + a);

	}
	
	public int test(int a,int b) { // method overloading with different return type
		System.out.println("Inside C :" + a);
		return a;

	}
	
	public void show(int a,int b) { 
		System.out.println("Inside  show C :"+a+","+b);//static method can be overloaded as instance method

	}
	
	public final void check(double a,int b) { //final method can be overloaded
		System.out.println("Inside  final show C :"+a+","+b);

	}
	
	public final void check(double a) { 
		System.out.println("Inside  final show C :"+a);//final method can be overloaded

	}
	
	
	

}
