package vehicle2;

import vehicle1.Bus1;

public class Car2 extends Bus1 {

	public void check6() {

		// System.out.println(busNo);
		System.out.println(location);
		System.out.println(name);
		// System.out.println(color);
	}

	public void check7() {

		Bus1 obj = new Bus1();

		// System.out.println(obj.busNo);
		// System.out.println(obj.location);
		System.out.println(obj.name);
		// System.out.println(obj.color);
		// obj.display();
		obj.check1();
		Car2.ownerName = "Bus3 owner";
	}

}
