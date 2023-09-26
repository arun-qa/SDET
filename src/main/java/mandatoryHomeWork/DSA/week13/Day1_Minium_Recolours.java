package mandatoryHomeWork.DSA.week13;

public class Day1_Minium_Recolours {
	
	/*https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
	 * 
	 * Pseudocode
	 * Get the input string blocks and k value, output should be int value
     * initiate two pointers variable start & end  with value 0 and another variable to keep track of the minvalue
     * start a while loop to iterate till the end of the array
	 * for each window, check the current index character.
	 *  - if it is 'w', replace it with 'B'
	 *  - track the count of replace operation for each window and compare it with the minvalue
	 *  - return the final minvalue 
	 *  
	 *  Time Complexity --> O(n)
	 *  Space Complexity --> O(1)
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String blocks = "WBBWWBBWBW";
		int k = 7;
		int count = 0;
		int pointer = 0;
		int minvalue = Integer.MAX_VALUE;

		while (pointer < k) {
			char ch1 = blocks.charAt(pointer);
			if (ch1 == 'W') {
				count++;
			}
			pointer++;
		}

		minvalue = Integer.min(minvalue, count);

		while (pointer < blocks.length()) {
			char ch2 = blocks.charAt(pointer - k);
			if (ch2 == 'W') {
				count--;

			}
			char ch3 = blocks.charAt(pointer);
			if (ch3 == 'W') {
				count++;
			}
			minvalue = Integer.min(minvalue, count);
			pointer++;
		}

			System.out.println(minvalue);
	}

}
