package mandatoryHomeWork.DSA;

public class Week_10_MaxNumberOfWordsFoundinSentence {
	
	/*
	 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
	 * 
	 * Pseudocode:
	 * Get an input as String[]
	 * Output should be int
	 * intialize max variable as 0;
	 * Iterate  for loop till the sentences.length
	 * initailize string variable and store the each sentences element and Initialize counter variable as 1
	 * Iterate one for loop to till each sentence length
	 * check each charcter of a string
	 * if ch == ' '; increase the count varaiable
	 * check count with max, if count is > max
	 * assign max = count and return max
	 * 
	 * Time complexity : O(n)*O(m) = O(n*m)
	 */
	public int mostWordsFound(String[] sentences) {

		int max = 0;

		for (int i = 0; i < sentences.length; i++) { //O(n)
			String sentence = sentences[i];
			int count = 1;

			for (int j = 0; j < sentence.length(); j++) {  //O(m)
				char ch = sentence.charAt(j);

				if (ch == ' ') {
					count++;

				}

			}
			if (count > max)
				max = count;
		}
		return max;

	}

}
