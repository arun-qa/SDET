package classRoomWeekDays;

import org.junit.Test;

import junit.framework.Assert;

public class PivoteIndex {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, findPivotIndex(new int[] {1,7,3,6,5,6}));
	}
	

	public int findPivotIndex(int[] nums)
	{
		int sumLeft;
	     int sumRight;
	     for (int i = 0; i < nums.length; i++) {
	         sumLeft = 0;
	         sumRight = 0;
	         for (int j = 0; j < nums.length; j++) {
	             if(j<i) sumLeft = sumLeft + nums[j];
	             else if(j>i) sumRight = sumRight + nums[j];
	         }
	         if(sumLeft == sumRight)
	             return i;
	     }
	     return -1;
	}

}
