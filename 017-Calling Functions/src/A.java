
public class A {
	int x;//instance variable
	static int y;//static variable
	
	void printX() {//instance method
		System.out.println(this.x);
		this.printWelcome();
		System.out.println(y);
		printGoodBye();
		new A();
	}
	
	void printWelcome() {//instance method
		System.out.println("Welcome");
	}
	
	static void  printY(){
		System.out.println(y);
		
	}
	static void printGoodBye() {
		System.out.println("Good bye");
	}
	
	A(){
		
		this(10);//constructor chaining
		System.out.println("Object is created");
		System.out.println(this.x);
		printWelcome();
		System.out.println(y);
		printGoodBye();
		//this(10);//constructor chaining should be in the first line
	}
	A(int x)
	{
		System.out.println("A object is created with"+x);
		this.x=x;
	}
}
