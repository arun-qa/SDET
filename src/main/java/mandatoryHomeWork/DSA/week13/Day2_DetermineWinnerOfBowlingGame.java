package mandatoryHomeWork.DSA.week13;

import org.junit.Test;
import org.testng.Assert;

public class Day2_DetermineWinnerOfBowlingGame {
	
	//https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/
	
	/*Pesudocode
	 * Get an input as int[], int[] output as int
	 * Create one function to find the diff between two int[] inputs
	 * Check for the int[] value should contain 10
	 * if so then multiply the next two values with two
	 * Add the values for both input [] and return which one is greater
	 * 
	 * 
	 * Time Complexity --> O(n)
	 * Space Complexity --> O(1)
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, isWinner(new int[] {4,10,7,9}, new int[] {6,5,2,3}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, isWinner(new int[] {4,10}, new int[] {10,4}));
	}

	public int isWinner(int[] player1, int[] player2) {
		// TODO Auto-generated method stub

		int p1 = score(player1);
		int p2 = score(player2);

		if (p1 > p2)
			return 1;
		else if (p1 < p2)
			return 2;
		return 0;
	}

	private int score(int[] play) {
		int sum = 0;
		for (int i = 0; i < play.length; i++) {
			if ((i - 1 >= 0 && play[i - 1] == 10) || (i - 2 >= 0 && play[i - 2] == 10)) {
				sum = sum + 2 * play[i];
			} else {
				sum =sum +  play[i];
			}
		}
		return sum;
	}

}
