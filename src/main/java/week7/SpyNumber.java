package week7;

import org.junit.Test;

import junit.framework.Assert;

public class SpyNumber {
	
	/* - Get the input as int nums , Initailize add=0, and multiply=1
	      - while the input is greater than 0 and do the below steps else return false
			 	Find the value for  remainder = nums%10 and get the last digit               
			 	then add the remainder value to Add variable as    add = add+remainder;            
			 	then multiply the remainder value to multiply variable as   multiply = multiply*remainder;
		     	multiply the given input num by 10 until it becomes 0
			 	divide the number until it becomes 0
		  - compare the multiply & add value
			    if both are equals return true
			    else return false */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isSpyNumber(132));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, isSpyNumber(1124));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false, isSpyNumber(11));
	}
	
	public boolean isSpyNumber(int num)
	{
		int add=0; int multiply=1; 
		
		while(num>0)
		{
			
			int remainder=num%10;                 
			add = add+remainder;               
			multiply = multiply*remainder;   
			num=num/10;                  
			
		}
		
		return add==multiply;
		
	}

}
