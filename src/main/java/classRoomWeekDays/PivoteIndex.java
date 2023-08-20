package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

import junit.framework.Assert;

public class PivoteIndex {
	

/*- intialize two variables - sumleft=0, sumright=0
- Iterate for loop till length of the given array
- Iterate one more for loop to compare the left index and right index
- if(j<i) sumleft = sumleft + nums[j];
- else if(j>i) sumright = sumright + nums[j];
- Compare sumleft and sumright, if both are equal return i;
- else return -1;*/
	
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
