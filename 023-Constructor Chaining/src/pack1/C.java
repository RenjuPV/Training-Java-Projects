package pack1;

public class C extends B {
	int z;

	public C(int x, int y, int z) {
		//this.x = x;
		//this.y = y;
		super(x,y);
		this.z = z;
		System.out.println("C constructor with 3 arguments" + x + "," + y + "," + z);
	}
	public C(int x, int y) {
		//this.x = x;
		//this.y = y;
		super(x,y);
		System.out.println("C constructor with 2 arguments" + x + "," + y) ;
	}
	public C(int x) {
		//this.x = x;
		
		super(x);
		System.out.println("C constructor with 1 arguments" + x ) ;
	}
	public C() {
	
		super();
		System.out.println("C constructor without arguments" ) ;
	}

}
