package mandatoryHomeWork.DSA.week12;

public class Day5_FindtheKbeauty {
	
	/*https://leetcode.com/problems/find-the-k-beauty-of-a-number/
	 * 
	 * Pseudocode
	 * Get an input as int & int, output should be int
	 * convert the given int num to string
	 * assign a counter variable 0, start variable as 0, and end variable as start+k-1
	 * get the substring based on start & end value
	 * Iterate the loop till length of number.length()
	 * return the count
	 * 
	 * Time Complexity --> O(n)
	 * Space Complexity --> O(1)
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=430043;
		int k=2;
		
		String number = String.valueOf(num);
		
		int n = number.length();
		int count = 0;
		int start = 0;
		int end = start+k-1;
		
		while(end<n)
		{
			int substr = Integer.parseInt(number.substring(start, end+1));
			if(substr!=0 && num%substr==0) {
				count++;
			}
			
			start = start+1;
			end = start+k-1;
		}
		
System.out.println(count);		

	}

}
