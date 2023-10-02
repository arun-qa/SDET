package week4.day1;

public class PivotIndex {
	
	
	
	public int pivotIndex(int[] nums)
	
	//[0,1,2,3,4,5]
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
