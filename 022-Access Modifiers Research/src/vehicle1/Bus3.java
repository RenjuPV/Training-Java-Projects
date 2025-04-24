package vehicle1;

public class Bus3 extends Bus1 {

	Bus1 b3 = new Bus1();
	Bus1 b2 = new Bus1(0,"ggg" , "ggg", "bbb");

	public void check3() {

		//System.out.println(busNo);
		System.out.println(location);
		System.out.println(name);
		System.out.println(color);
	}

	public void check4() {
		Bus1 obj = new Bus1();
		//System.out.println(obj.busNo);
		System.out.println(obj.location);
		System.out.println(obj.name);
		System.out.println(obj.color);
		obj.display();
		obj.check1();
		Bus3.ownerName="Bus3 owner";
	}

}
