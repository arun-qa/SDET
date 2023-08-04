package week5;

import org.junit.Test;

import junit.framework.Assert;

public class AlternatingDigitSum {
	
	/*
	 * You are given a positive integer n. Each digit of n has a sign according to the following rules:
	 * The most significant digit is assigned a positive sign.
	 * Each other digit has an opposite sign to its adjacent digits.
	 * Return the sum of all digits with their corresponding sign.
	 * 
	 * 
	 * 1. Input : int
	 * 	  Output : int
	 * 
	 * 2. Test Data
	 * 		Input: n = 521
			Output: 4
			Explanation: (+5) + (-2) + (+1) = 4.
			
			
			Input: n = 111
			Output: 1
			Explanation: (+1) + (-1) + (+1) = 1.
			
			
			Input: n = 886996
			Output: 0
			Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.
	 * 
	 * 3. Approach --> Brute force Approach
	 * 
	 * 4. Pseudocode
	 * 1.) Convert int to String
	 * 2.) Initialize total =0;
	 * 3.) Iterate the i value from 0 to length of the string
	 * 4.) if(i%2==0) 
			{
			total = total + (s.charAt(i) - '0')	;
			}
			else
			{
				total = total - (s.charAt(i) - '0');
			}
	 * 5.) return total
	 * 
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(4, alternateDigitSum(521));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(1, alternateDigitSum(111));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0, alternateDigitSum(886996));
	}
	
	
	public int alternateDigitSum(int n)
	{
		String s = String.valueOf(n);
		
		int total=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(i%2==0) 
			{
			total = total + (s.charAt(i) - '0')	;
			}
			else
			{
				total = total - (s.charAt(i) - '0');
			}
		}
		
		return total;
		
	}
	
	

}
