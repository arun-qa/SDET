package week6;

import org.junit.Test;

import junit.framework.Assert;

public class ThreeDivisors {
	
	int count = 0;
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, isthree(2));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, isthree(4));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false, isthree(30));
	}
	
	
	public boolean isthree(int n)
	{
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==3)
		return true;
		return false;
		
	}
	
}

	

