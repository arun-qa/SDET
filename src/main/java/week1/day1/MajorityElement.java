package week1.day1;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,2,3,2,2};   //O(1)
		
		int len = nums.length;    //O(1)
		
		int count = 1;         //O(1)
		
		for(int i=0; i<len; i++) //O(n)
		{
			
			for(int j=i+1; j<len; j++) //O(n)
			{
				if(nums[i]==nums[j]) //O(1)
				{
					count = count+1;   //O(1)
				}
			}
			if(count > len/2)   //O(1)
			{
				System.out.println(nums[i]);
			}
			
			count = 1;
		}

	}

}
