package week1.day1;

public class NumberOfOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Question - Find the number of 1's present in the array
		 *  
		 *  Pseudo code
		 *  - Get an input as int of array
		 *  - Get total length of array
		 *  - Traverse the loop till the last integer
		 *  - count the value which is not equal to 1
		 *  - Total length of an array - count value
		 *  - will get the number of 1's present in array
		 */
		
		int[] nums = {1,0,0,1,1,1,0,1,2,3,1}; //O(1)
		
		int count = 0;  //O(1)
		
		
		
		for(int i=0; i<nums.length; i++) //O(n)
		{
			if(nums[i]!=1) //O(1)
			{
				count++;
			}
		}
		int ones = ((nums.length)-count);  //O(1)
		
		System.out.println(ones);
		
	}

}
