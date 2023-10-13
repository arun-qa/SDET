package mandatoryHomeWork.DSA.week15;

import org.junit.Test;
import org.testng.Assert;

public class Day1_DominosPair {
	
	/* https://leetcode.com/problems/number-of-equivalent-domino-pairs/description/
	 * 
	 * Pseudocode
	 * get input as int[][] and output as int
	 * initiate counter variable
	 * Iterate for loop till dominoes length
	 * declare the variables f1,f2 & s1,s2
	 * compare the variables & increment the count
	 */

@Test
public void test1()
{
	Assert.assertEquals(1, numEquivDominoPairs(new int[][]{{1,2},{2,1},{3,4},{5,6}}));
}

	public int numEquivDominoPairs(int[][] dominoes) {

		int count = 0;

		for (int i = 0; i < dominoes.length; i++) {
			int f1 = dominoes[i][0];
			int f2 = dominoes[i][1];

			for (int j = i + 1; j < dominoes.length; j++) {
				int s1 = dominoes[j][0];
				int s2 = dominoes[j][1];

				if (f1 == s1 && f2 == s2 || f1 == s2 && f2 == s1)
					count++;

			}
		}

		return count;

	}

}