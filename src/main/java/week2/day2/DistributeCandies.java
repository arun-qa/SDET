package week2.day2;

import org.junit.Test;

import junit.framework.Assert;

public class DistributeCandies {
	
	@Test
	public void test1()
	{
	int[] actual = {1,1,2,2,3,3};
	int output = 3;
	Assert.assertEquals(output, distibuteCandies(actual));
	
	
	}
	
	public int distibuteCandies(int[] candyType)
	{
		int flag=0;    //O(1)
		int counter=0;  //O(1)
		for(int i=0; i<candyType.length;i++)   //O(n)
		{
			flag=0;  //O(1)
			for(int j=i+1; j<candyType.length;j++)  //O(n)
			{
				if(candyType[i]==candyType[j]) //O(1)
				{
					flag=1;
					break;
				}
			}
			if(flag!=1)  //O(1)
			{
				counter++;
			}
		}
		if(candyType.length/2 > counter)  //O(1)
			return counter;
		return candyType.length/2;
	}

}
