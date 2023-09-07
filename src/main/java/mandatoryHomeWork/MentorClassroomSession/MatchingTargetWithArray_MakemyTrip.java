package mandatoryHomeWork.MentorClassroomSession;

public class MatchingTargetWithArray_MakemyTrip {
	
	/* PseudoCode
	 * Get an input as integer array
	 * Output should be int
	 * Initialize two counter variables with value 0
	 * Iterate loop starting from 0 and check the indexofarray & target is same, If it is same get the i value and assign it to counter variable
	 * Iterate loop starting from arr.length-1 and check the indexofarray & target is same, If it is same get the i value and assign it to another counter variable
	 * print both the counter variables
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {0,0,1,1,4,1,7,1,9};
		int target=1;
		int firstmatch = 0;
		int lastmatch = 0;
		//op:3 & 5
		
		//Time complexity : O(n) + O(n) = O(n)
		
		for(int i=0; i<arr.length; i++)  //O(n)
		{
			if(arr[i] == target)
			{
				firstmatch = i;
				break;

			}
		}
		for(int i=arr.length-1; i<=arr.length; i--) //O(n)
		{
			if(arr[i]==target)
			{
				lastmatch = i;
				break;

			}
		}
		
		System.out.println(firstmatch+","+lastmatch);

	}

}
