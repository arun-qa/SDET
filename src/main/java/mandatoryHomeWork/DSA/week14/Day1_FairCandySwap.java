package mandatoryHomeWork.DSA.week14;

import java.util.HashSet;
import java.util.Set;

public class Day1_FairCandySwap {

	private int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

		int totalAlliceCandy = 0;
		int totalBobCandy  = 0;
		Set<Integer> set = new HashSet<>();
		for (Integer a : aliceSizes) { // O[N]
			totalAlliceCandy += a;
		}
		for (Integer b : bobSizes) { // O[M]
			totalBobCandy += b;
			set.add(b);
		}

		int diff = (totalBobCandy - totalAlliceCandy) / 2;
		for (Integer a : aliceSizes) {
			if (set.contains(a + diff))
				return new int[] { a, a + diff };
		}
		return new int[0];
	}

}
