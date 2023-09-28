package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

public class MaxProductNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@Test
		public void test1() {
			int[] input = {3,5,8,1,2,0,6,4};
			int[] output = {5,6,8};
			int[] actOutput = findMaxProdNumbers(input);
			Arrays.sort(actOutput);
			Assert.assertArrayEquals(output, actOutput);
		}

		Arrays.sort(input);
		
		int n = input.length;
		
		// Calculate the product of the three largest positive numbers
        int productWithPositives = input[n - 1] * input[n - 2] * input[n - 3];

        // Calculate the product of the two smallest and the largest (for handling negative numbers)
        int productWithNegatives = input[0] * input[1] * input[n - 1];

        if (productWithPositives > productWithNegatives) {
        	
        	System.out.println(input[n - 3], input[n - 2], input[n - 1]);
            return new int[]{};
        } else {
            return new int[]{input[0], input[1], input[n - 1]};
        }
	}

}
