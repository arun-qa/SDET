package week2.day1;

import org.junit.Test;

import junit.framework.Assert;

public class ArrangingCoins {
	
	/* Question - https://leetcode.com/problems/arranging-coins/description/
	 * 
	 * You have n coins and you want to build a staircase with these coins. 
	 * The staircase consists of k rows where the i th row has exactly i coins. 
	 * The last row of the staircase may be incomplete.
	 * Given the integer n, return the number of complete rows of the staircase you will build.
	 * 
	 * Psuedo code:
	 * 
	 * Get the input as an integer
	 * Iterate for loop till length of the coins
	 * coins = coins - i;
	 * return i-1;
	 */
	@Test
	
	public void test1(){
		
		Assert.assertEquals(2, NumberOfSteps(5));
		
	}
	
	@Test
	
	public void test2(){
		
		Assert.assertEquals(3, NumberOfSteps(6));
		
	}
	
	
	public int NumberOfSteps(int coins)
    {
        int i;
       for( i=1;i<=coins;i++)  //O(n)
        {
            //steps=steps+i;
            coins = coins-i;  //O(1)
          
        }
        return i-1;
    }

}
