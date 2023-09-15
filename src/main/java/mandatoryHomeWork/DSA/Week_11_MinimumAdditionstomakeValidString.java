package mandatoryHomeWork.DSA;

public class Week_11_MinimumAdditionstomakeValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*https://leetcode.com/problems/minimum-additions-to-make-valid-string/description/
		 * 
		 * Pseudo code
		 * Init count=0; Run a for loop till length of word If word.charAt(i) equals
		 * 'a', inc i by 1, else inc ans by 1 if i < word.length() && word.charAt(i)==
		 * 'b' inc i by 1, else inc ans by 1 if i < word.length() && word.charAt(i)==
		 * 'c' inc i by 1, else inc ans by 1
		 * 
		 * Time Complexity O(n)
		 */

		String word = "bbb";

		int count = 0;
		for (int i = 0; i < word.length();) { //O(n)
			if (word.charAt(i) == 'a')
				i++;
			else
				count++;
			if (i < word.length() && word.charAt(i) == 'b')
				i++;
			else
				count++;
			if (i < word.length() && word.charAt(i) == 'c')
				i++;
			else
				count++;
		}

		System.out.println(count);

	}

}
