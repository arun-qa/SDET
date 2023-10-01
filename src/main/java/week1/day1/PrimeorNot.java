package week1.day1;

import org.junit.Test;

import junit.framework.Assert;

public class PrimeorNot {
	
	/*
	 * Question - Check if the given number is prime or Not
	 * Declare the variable
	 * Check whether if the variable is divisible by itself and divisible by 1
	 * print true
	 * print false
	 */
	@Test
	public void test1()
	{
		boolean prime = isPrime(7);
		Assert.assertEquals(true, prime);
	}
	
	@Test
	public void test2()
	{
		boolean prime = isPrime(4);
		Assert.assertEquals(false, prime);
	}
	
	
	public boolean isPrime(int input)
	{
		
		for(int i=2; i<input; i++) //O(n)
		
		{
			if(input%i==0) //O(1)
			{
				return false;
			}
		}
		return true;
}

}
