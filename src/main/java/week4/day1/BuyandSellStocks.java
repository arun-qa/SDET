package week4.day1;

import org.junit.Test;

import junit.framework.Assert;

public class BuyandSellStocks {
	
	@Test
	public void test1()
	{
		int[] price1 = {7,1,5,3,6,4};
		Assert.assertEquals(4, maxProfit(price1));
	}
	
		
	public int maxProfit(int[] prices)
	{
		int maxProfit = 0;
		int currentProfit = 0;
		int buyPrice = prices[0];
		
		for(int i=0; i<prices.length; i++)
		{
			if(prices[i] < buyPrice)
			{
				buyPrice = prices[i];
				
			}
				
				currentProfit = prices[i] - buyPrice;
				
				if(maxProfit<currentProfit)
				{
					 maxProfit=currentProfit;

				}
			}
		
		return maxProfit;
		
	}

}
