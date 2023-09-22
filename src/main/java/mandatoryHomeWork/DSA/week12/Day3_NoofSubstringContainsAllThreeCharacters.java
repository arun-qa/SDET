package mandatoryHomeWork.DSA.week12;

public class Day3_NoofSubstringContainsAllThreeCharacters {
	
	/*
	 * https://leetcode.com/problems/number-of-substrings-containing-all-three-characters
	 * Pseudocode
	 * 
	 * Get an input as String and output should be int.
	 * create integer[] to count values of abc
	 * create three variable start, end, output
	 * iterate rightindex till length of the given String and convert the string to char array to find the occurance of a,b,c
	 * verify if the current substring contains at least one a,b,c => If yes then update result count as all
	 * 
	 * 
	 * 
	 */	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaacb" ;
		int[] countabc = new int[3];
        int left = 0;
        int right = 0;
        int output = 0;
        int n = s.length();
        
        while(right<n)
        {
        	countabc[s.charAt(right)-'a']++;
        	while(countabc[0]>0 && countabc[1]>0 && countabc[2]>0)
        	{
        		output = output + n -right;
        		countabc[s.charAt(left++)-'a']--;
        	}
        	right++;
        }
        System.out.println(output);
        
}
}
