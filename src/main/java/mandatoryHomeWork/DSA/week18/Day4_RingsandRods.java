package mandatoryHomeWork.DSA.week18;

import org.junit.Test;

public class Day4_RingsandRods {
	
	/*https://leetcode.com/problems/rings-and-rods/description/
	 * 
	 * Pseudocode
	 * Create int[10] for all the colors
	 * Iterate for loop till length of String and icrement by 2 & findthe color of ring
	 * And find the respective ring value
	 * Iterate counter variable & find the colors in each rod
	 * If the rod has all colors, increment the count & return it
	 * 
	 */

	@Test
	public void test1() {
		System.out.println(countPoints("B0B6G0R6R0R6G9"));
	}

	public int countPoints(String rings) {
		int red[] = new int[10];
		int blue[] = new int[10];
		int green[] = new int[10];
		for (int i = 0; i < rings.length(); i += 2) {
			int x = rings.charAt(i + 1)-'0';

			if (rings.charAt(i) == 'B') {
				blue[x]++;
			}
			if (rings.charAt(i) == 'G') {
				green[x]++;
			}
			if (rings.charAt(i) == 'R') {
				red[x]++;
			}
		}

		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (red[i] > 0 && blue[i] > 0 && green[i] > 0) {
				count++;
			}
		}

		return count;

	}

}
