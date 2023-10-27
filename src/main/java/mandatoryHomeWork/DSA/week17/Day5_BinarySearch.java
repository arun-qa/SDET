package mandatoryHomeWork.DSA.week17;

import org.junit.Test;
import org.testng.Assert;

public class Day5_BinarySearch {
	
	/* Pseudocode
	https://leetcode.com/problems/binary-search/description/
    1.  Initialize two pointers, "left" and "right," to the first and last indices of the array "arr."
    2. Start a loop that continues as long as "left" is less than or equal to "right."
    3. Inside the loop:
        a. Calculate the middle index "mid" as the average of "left" and "right." This determines the middle element in the current search interval.
        b. Check if the element at index "mid" in the array "arr" is equal to the "value" you are searching for:
            - If they are equal, return "mid" because you found the value at this index.
        c. If the element at index "mid" is less than the "value":
            - Update the "left" pointer to be "mid + 1." This narrows the search interval to the right half.
        d. If the element at index "mid" is greater than the "value":
            - Update the "right" pointer to be "mid - 1." This narrows the search interval to the left half.
    4. If the loop exits (left > right) without finding the "value," return -1 to indicate that the "value" is not present in the array.

    Time Complexity - O[log N] Space Complexity - O[1] */
	
	
	@Test
	public void test1()
	{
		Assert.assertEquals(7, search(new int[] {1,2,3,4,5,6,7,8,9} , 8));

	}
	
	public int search(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length-1;
		
		while(left<=right)
		{
			int mid = left + (right-left)/2 ;
			
			if(nums[mid] == target)
			{
				return mid;
			}
			
			else if(nums[mid] < target)
			{
				left = mid + 1;
			}
			
			else
			{
				right = mid -1;
			}
		}
		
		return -1;	
		
	}

}
