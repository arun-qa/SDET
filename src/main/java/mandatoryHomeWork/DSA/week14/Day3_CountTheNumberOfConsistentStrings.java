package mandatoryHomeWork.DSA.week14;

import java.util.HashSet;

public class Day3_CountTheNumberOfConsistentStrings {

	/*
	 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
	 * description/
	 * 
	 * Pseudocode
	 * Get two inputs one as String and another one as String[], output as int
	 * store the each character of String in Set
	 * create another for loop & get each word
	 * Iterate another for loop & get the each character from each word
	 * Check if the character not found in Set, if so set the flag as false & break the statement
	 * increment the count & return the count
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String allowed = "abc";
		String[] words = new String[] {"a","b","c","ab","ac","bc","abc"};
		//boolean flag = true;
		int count = 0;
		
		HashSet<Character> set = new  HashSet<Character>();
		
		for (Character ch : allowed.toCharArray()) {
			
			set.add(ch);
			
		}
		for (String eachword : words) {
			boolean flag = true;
			
			for(Character ch1 : eachword.toCharArray())
			{
				if(!set.contains(ch1))
						{
					flag = false;
					break;
						}
			}
			if(flag==true)
				count++;
			
		}
		System.out.println(count);

	}

}
