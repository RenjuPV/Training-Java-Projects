
public class CClient {

	public static void main(String[] args) {
		
		C.PrintCount();
		
		C obj=new C();
		C.count++;
		obj.name="Renju";
		obj.printName();
		C.PrintCount();
		
		C obj1=new C();
		C.count++;
		obj1.name="Anju";
		obj1.printName();
		C.PrintCount();
		
		
		C obj2=new C();
		C.count++;
		obj2.name="Manju";
		obj2.printName();
		C.PrintCount();
		
		
		
		
	


	}

}
