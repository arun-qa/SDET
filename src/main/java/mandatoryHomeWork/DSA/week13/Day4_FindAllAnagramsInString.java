package mandatoryHomeWork.DSA.week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Day4_FindAllAnagramsInString {

	@Test
	public void test1() {
		Assert.assertEquals(Arrays.asList(0, 6), findAnagrams("cbaebabacd", "abc"));
	}

	public List<Integer> findAnagrams(String s, String p) {
		int sCount[] = new int[26];
		int pCount[] = new int[26];
		List<Integer> list = new ArrayList<Integer>();
		int start = 0, end = p.length();
		if (s.length() < p.length()) {
			return list;
		}

		for (int i = 0; i < p.length(); i++) {
			sCount[s.charAt(i) - 'a']++;
			pCount[p.charAt(i) - 'a']++;
		}
		if (Arrays.equals(sCount, pCount)) {
			list.add(start);
		}

		while (end < s.length()) {
			sCount[s.charAt(end) - 'a']++;
			sCount[s.charAt(start) - 'a']--;

			if (Arrays.equals(sCount, pCount)) {
				list.add(start + 1);
			}
			start++;
			end++;
		}
		return list;
	}

}
