package mandatoryHomeWork.DSA.week14;

import java.util.HashSet;

public class Day2_Panagram {
	
	/*https://leetcode.com/problems/check-if-the-sentence-is-pangram/
	 *Pseudocode 
	 * Get an input as String and output as boolean
	 * Create an set
	 * convert string to ch[]
	 * iterate for loop till ch.length
	 * add each iteration value to set
	 * finally check the size of set
	 * if it is 26 return true else false
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "thequickbrownfoxjumpsoverthelaydog";

		HashSet<Character> set = new HashSet<Character>();

		char[] ch = sentence.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);

		}
		if (set.size() == 26) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

}
