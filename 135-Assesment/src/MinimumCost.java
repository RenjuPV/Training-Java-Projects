
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinimumCost {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int fendCount;
		int bendCount;

		fendCount = Integer.parseInt(br.readLine());
		bendCount = Integer.parseInt(br.readLine());

		String[] arr1 = br.readLine().trim().split(" ");
		String[] arr2 = br.readLine().trim().split(" ");

		List<Developer> developers = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {
			developers.add(new Developer(Integer.parseInt(arr1[i]), Integer.parseInt(arr2[i])));
		}
		// Sort developers based on the absolute cost difference
		developers.sort(Comparator.comparingInt(d -> Math.min(d.frontEndCost , d.backEndCost)));

		int totalCost = 0;
		int numberHired = 0;
		int frontEndHired = 0, backEndHired = 0;

		for (Developer dev : developers) {

			if (frontEndHired < fendCount && (dev.frontEndCost <= dev.backEndCost || backEndHired >= bendCount)) {
				totalCost += dev.frontEndCost;
				System.out.println("frontEndCost : "+dev.frontEndCost);
				frontEndHired++;
			} else if (backEndHired < bendCount) {
				totalCost += dev.backEndCost;
				System.out.println("backEndCost : "+dev.backEndCost);
				backEndHired++;
			}
			numberHired++;
			if (frontEndHired == fendCount && backEndHired == bendCount) {
				break;
			}

		}
		System.out.println("Total Hired" + numberHired);
		System.out.println("Total Cost" + totalCost);

	}
}

class Developer {
	int frontEndCost;
	int backEndCost;

	public Developer(int frontEndCost, int backEndCost) {
		super();
		this.frontEndCost = frontEndCost;
		this.backEndCost = backEndCost;
	}

}
