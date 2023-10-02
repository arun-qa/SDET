package week3.day2;

import org.junit.Test;

import junit.framework.Assert;

public class CountPrimes {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(4, countPrimes(10));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, countPrimes(5));
	}
	
	public int countPrimes(int n) {
        if(n==0 || n==1) return 0;
        int count =0;
        int flag =0;
        for(int i=1;i<=n-1;i++)  //O(n)
        {
            int nu =i;
            for(int j=2;j<=nu-1;j++) //O(n)
            {
                if(nu%j !=0)
                {
                    count++;
                    break;
                      }
                else{
                    break;
                }
                
            }
        }
	return count+1;
	}
}	
            


       

