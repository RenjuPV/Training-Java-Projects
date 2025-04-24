package pack1;

public class B {
	private int x,y;
	public B() {
		System.out.println("B constructor without arguments");
	}
	
	public B(int x) {
		this();
		System.out.println("B constructor with 1 arguments");
		this.x=x;
	}
	public B(int x,int y) {
		this(x);
		System.out.println("B constructor with 2 arguments"+ x +", "+y);
		//this.x=x;
		this.y=y;
	}


}
