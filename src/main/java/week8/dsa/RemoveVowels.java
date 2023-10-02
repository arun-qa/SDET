package week8.dsa;

public class RemoveVowels {
	
	/*
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)Yes
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Input : "Hi TestLeaf Students";
	 * Output : "H TstLf Stdnts";
	 * 
	 * Input : "My Rhythms fly";
	 * Output : "My Rhythms fly";
	 * 
	 * 3.Do you know the Solution? Yes
	 * 
	 * 
	 * Derive Pseudo code in paper (for the best chosen approach)
	 * 
	 * Get an input as String
	 * Iterate the String and check whether it equal to any of the vowels
	 * If condition matches remove that letter
	 * print the output
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Hi TestLeaf Students";
		//String output = "";
		
		for(int i=0; i<input.length();i++)
		{
			if(input.charAt(i) == 'a' 
					|| input.charAt(i) == 'e' 
					||input.charAt(i) == 'i' 
					||input.charAt(i) == 'o' 
					|| input.charAt(i) == 'u')
			{
				continue;
			}
			else
			{
				System.out.print(input.charAt(i));
			}
		}

	}

}
