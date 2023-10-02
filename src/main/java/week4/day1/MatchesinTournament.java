package week4.day1;

import org.junit.Test;

import junit.framework.Assert;

public class MatchesinTournament {
	
	
	@Test
	public void test1()
	{
		Assert.assertEquals(13, countofmatches(14));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(6, countofmatches(7));
	}
	
	public int countofmatches(int n)
	{
		int count = 0;
		
		while(n>1) //4
		{
		
		if(n%2==0) 
		{
			count = count + n/2; // 2
			n=n/2;				// 2
		}
		else
		{
			count = count+n/2; // 7+3=10
			n= (n/2)+1;     // 3+1 = 4
			
		}
		
		}
		
		return count;
		
	}

}
