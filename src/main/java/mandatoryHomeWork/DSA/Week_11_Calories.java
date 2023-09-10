package mandatoryHomeWork.DSA;

import org.junit.Test;
import org.testng.Assert;

public class Week_11_Calories {

	@Test
	public void test1() {
		Assert.assertEquals(0, dietPlan(new int[] { 1, 2, 3, 4, 5 }, 1, 3, 3));
	}

	public int dietPlan(int[] calories, int k, int lower, int upper) {
		int totalPoints = 0;
		int totCalories = 0;
		int[] cArr = new int[k];
		for (int i = 0; i<=calories.length-k; i++) {
			for (int j = i; j < i + k; j++) {
				totCalories = 0;

				//cArr[j] = calories[i];
				totCalories = totCalories + calories[i];
			}
			if (totCalories < lower)
				totalPoints--;
			if (totCalories > upper)
				totalPoints++;

		}

		return totalPoints;

	}

}
