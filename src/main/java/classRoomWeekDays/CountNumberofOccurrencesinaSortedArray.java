package classRoomWeekDays;

public class CountNumberofOccurrencesinaSortedArray {
	// Given a sorted array arr[] and a number x, 
	//write a function that counts the occurrences of x in arr[]. 
	//Expected time complexity is O(Logn) 
	//  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
	//  Output: 4 // x (or 2) occurs 4 times in arr[]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 1, 2, 2, 2, 2, 3};
		int x=2;
		int count =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==x)
			{
				count++;
			}
		}
		System.out.println(count);	

	}

}
