import java.util.Arrays;

public class main12 {

	public static void main(String[] args) {
		int v1=10;
		byte v2=20;
		int[] arr= {v1,v2,30,40,50,60};
		System.out.println("Array before operations:");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(i%2==0)
				arr[i]=arr[i]*arr[i];
			else
				arr[i]=arr[i]*arr[i]*arr[i];
		}
		System.out.println("Array After operations:");
		System.out.println(Arrays.toString(arr));
	}

}
