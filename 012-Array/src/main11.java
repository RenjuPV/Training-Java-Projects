import java.util.Arrays;

public class main11 {

	public static void main(String[] args) {
		
		int size=4;
		//int size=-4;//negative index exception
		int[] array=new int[size];
		array[0]=50;
		array[1]=80;
		array[2]=100;
		array[3]=200;
		System.out.println(Arrays.toString(array));

	}

}
