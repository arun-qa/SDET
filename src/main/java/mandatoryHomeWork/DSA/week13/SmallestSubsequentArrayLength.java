package mandatoryHomeWork.DSA.week13;

public class SmallestSubsequentArrayLength {

	/*
	 * Psuedocode : 
	 * 1. Get the input array 
	 * 2. declare two variables left and right
	 * and assign it to 0 
	 * 3. Start a while loop and iterate through the array till right<array length and current sum is greater than the given k value 
	 * 4.For each iteration, 
	 * a. calculate current sum as sum of left index value and right index value 
	 * b. check if the current sum is greater than the k value 
	 * c. if the above step returns true, 
	 *   - a.calculate the window size and add it in a variable called minSize 
	 *   - b.reduce the first index value from the current sum , move the left pointer by 1 
	 * d. if the step b returns false, increment the right pointer alone till reaches the condition currentsum > k 
	 * 5. return the final mininum window size
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 7, 2, 1, 3, 7, 9, 5 };
		int k = 20;
		int start = 0;
		int end = 0;
		int currentsum = 0;
		int windowsize = 0;

		while (end <= arr.length) {
			if (currentsum > k) {
				windowsize = end - start;
				currentsum = currentsum - arr[start];
				start++;
			} else {
				if (end == arr.length) {
					break;
				}
				currentsum = currentsum + arr[end];
				end++;
			}

		}
		System.out.println(windowsize);
	}

}
