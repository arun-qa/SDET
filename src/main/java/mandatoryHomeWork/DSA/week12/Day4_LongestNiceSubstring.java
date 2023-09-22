package mandatoryHomeWork.DSA.week12;

public class Day4_LongestNiceSubstring {
	
	/*https://leetcode.com/problems/longest-nice-substring/description/
	 * 
	 * 
	 * Time complexity: O(n^2)
	 * Space complexity: O(1)
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String s = "YazaAay";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String sub = s.substring(i, j + 1);
				if (isGood(sub) && sub.length() > result.length())
					result = sub;
			}
		}
		System.out.println(result);
	}

	private static boolean isGood(String sub) {
		int[] lower = new int[26];
		int[] upper = new int[26];
		for (int i = 0; i < sub.length(); i++) {
			char c = sub.charAt(i);
			if (Character.isLowerCase(c))
				lower[c - 'a']++;
			else
				upper[c - 'A']++;
		}
		for (int i = 0; i < 26; i++) {
			if (lower[i] != 0 && upper[i] == 0 || upper[i] != 0 && lower[i] == 0)
				return false;
		}
		return true;

	}
}
