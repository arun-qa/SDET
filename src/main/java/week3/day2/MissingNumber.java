package week3.day2;

import org.junit.Test;

import junit.framework.Assert;

public class MissingNumber {
	
	@Test
    public void test1(){
        int[] nums = {3,0,1}; //0,1,3
        int output = 2;
        int n =3;
        int actual = checkMissingNo(nums, n);
        Assert.assertEquals(actual, output);

    }
    @Test
    public void test2(){
        int[] nums = {0,1}; //0,1,3
        int output = 2;
        int n =2;
        int actual = checkMissingNo(nums, n);
        Assert.assertEquals(actual, output);

    }
    @Test
    public void test3(){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int output = 8;
        int n =9;
        int actual = checkMissingNo(nums, n);
        Assert.assertEquals(actual, output);

    }

	
	
	
	public int checkMissingNo(int[] nums,int n)
	{
		int[] arr = new int[n+1];
		
		for(int a:nums)
		{
			arr[a]++;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0)
				
				return i;
		}
		
		
		return 0;
		
	}

}
