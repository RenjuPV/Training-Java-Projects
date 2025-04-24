package vehicle1;

public class Bus2 {

	public void check2() {
		Bus1 b1 = new Bus1();
		Bus1 b2 = new Bus1(0, "ggg", "ggg", "bbb");
		//System.out.println(b1.busNo);
		System.out.println(b1.location);
		System.out.println(b1.name);
		System.out.println(b1.color);
		b1.check1();
		Bus1.ownerName = "AAAA";
		b1.display();
	}

}
