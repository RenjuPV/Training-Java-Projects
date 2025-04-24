
public class BClient {
	public static void main(String[] args) {
		
		System.out.println(B.companyName);
		
		B bObj=new B();
		bObj.location="COC";
		System.out.println(bObj.location);
		B.greet();
		bObj.goodBye();
		
	}

}
