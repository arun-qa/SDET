package mandatoryHomeWork.DSA.week14;

import java.util.HashMap;

public class Day2_JewelsStones {

	/*
	 * https://leetcode.com/problems/jewels-and-stones/description/
	 * 
	 * Pseudocode Get an input as String and output as int create map, iterate the
	 * stones character still stones.length add the stones character and count of
	 * each character as K,V pair iterate another loop for jewels and check each
	 * character with map if the value exist, add the value with count return count
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jewels = "aA";
		String stones = "aAAbbbb";
		int count = 0;

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < stones.length(); i++) {
			if (map.containsKey(stones.charAt(i))) {
				map.put(stones.charAt(i), map.get(stones.charAt(i)) + 1);
			} else {
				map.put(stones.charAt(i), 1);
			}
		}

		for (int j = 0; j < jewels.length(); j++) {
			if (map.containsKey(jewels.charAt(j))) {
				count = count + map.get(jewels.charAt(j));
			}
		}
		System.out.println(count);
	}

}
