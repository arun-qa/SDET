package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

public class Week_11_SplitStringinBalancedString {

		// TODO Auto-generated method stub
		
		/*https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/
		 * 
		 * Pseudocode
		 * Initiate count & max variable with 0
		 * Iterate for loop till length of s
		 * Check each character from string s
		 * If it is equal to R count--; else count++;
		 * If count==0; max++;
		 * return max
		 * 
		 * Time Complexity O(n)
		 */
		
		@Test
		public void test1()
		{
			Assert.assertEquals(4, balancedStringSplit("RLRRLLRLRL"));
		}
		
		@Test
		public void test2()
		{
			Assert.assertEquals(2, balancedStringSplit("RLRRRLLRLL"));
		}
		
		@Test
		public void test3()
		{
			Assert.assertEquals(1, balancedStringSplit("LLLLRRRR"));
		}
		

		public int balancedStringSplit(String s) {

			int count = 0;
			int max = 0;

			for (int i = 0; i <= s.length() - 1; i++) // O(n)
			{
				if (s.charAt(i) == 'R')

					count--;
				else {
					count++;
				}
				if (count == 0)
					max++;

			}

			return max;

		}

	}


